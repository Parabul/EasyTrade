package com.anarbek.shop.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anarbek.shop.dao.domain.entity.ShopUser;
import com.anarbek.shop.dao.service.UserService;
import com.anarbek.shop.runner.DataInitialize;

@Service("shopUserDetailsService")
public class ShopUserDetailsService implements UserDetailsService {

	private static final Logger log = LoggerFactory.getLogger(DataInitialize.class);

	@Autowired
	private UserService userService;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		log.info("loadUserByUsername: " + email);
		ShopUser user = userService.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("Username not found");
		}
		return new User(user.getEmail(), user.getPassword(), user.isEnabled(), user.isAccountNonExpired(),
				user.isCredentialsNonExpired(), user.isAccountNonLocked(), getGrantedAuthorities(user));

	}

	private List<GrantedAuthority> getGrantedAuthorities(ShopUser user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : user.getRoles()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
		}
		return authorities;
	}

}
