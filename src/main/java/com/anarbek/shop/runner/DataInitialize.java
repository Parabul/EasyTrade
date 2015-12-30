package com.anarbek.shop.runner;

import java.util.Arrays;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.anarbek.shop.dao.domain.entity.Customer;
import com.anarbek.shop.dao.domain.entity.ShopUser;
import com.anarbek.shop.dao.jooq.Tables;
import com.anarbek.shop.dao.jooq.tables.records.CustomerRecord;
import com.anarbek.shop.dao.repository.CustomerRepository;
import com.anarbek.shop.dao.repository.UserRepository;

@Component
public class DataInitialize implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DataInitialize.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private DSLContext create;

	@Override
	public void run(String... arg0) throws Exception {
		customerRepository.save(new Customer("Jack", "Bauer"));
		customerRepository.save(new Customer("Chloe", "O'Brian"));
		customerRepository.save(new Customer("Kim", "Bauer"));
		customerRepository.save(new Customer("David", "Palmer"));
		customerRepository.save(new Customer("Michelle", "Dessler"));

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Customer customer : customerRepository.findAll()) {
			log.info(customer.toString());
		}
		log.info("");

		// fetch an individual customer by ID
		Customer customer = customerRepository.findOne(1L);
		log.info("Customer found with findOne(1L):");
		log.info("--------------------------------");
		log.info(customer.toString());
		log.info("");

		// fetch customers by last name
		log.info("Customer found with findByLastName('Bauer'):");
		log.info("--------------------------------------------");
		for (Customer bauer : customerRepository.findByLastName("Bauer")) {
			log.info(bauer.toString());
		}
		log.info("");

		ShopUser user = new ShopUser();
		user.setEmail("anarbek");
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode("123456"));
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		user.setRoles(Arrays.asList("USER, ADMIN"));
		userRepository.save(user);

		Result<CustomerRecord> results = create.selectFrom(Tables.CUSTOMER)
				.where(Tables.CUSTOMER.LAST_NAME.contains("Bauer")).fetch();
		log.info("--------------------------------------------");
		log.info("result.size: " + results.size());
		for (CustomerRecord customerRecord : results) {
			log.info("customerRecord.toString(): " + customerRecord.toString());
		}

	}
}
