package com.anarbek.shop.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anarbek.shop.dao.domain.entity.ShopUser;
import com.anarbek.shop.dao.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public ShopUser findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
