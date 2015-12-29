package com.anarbek.shop.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anarbek.shop.dao.repository.ProductRepository;

@Service
public class ProductPrivateService {

	@Autowired
	private ProductRepository productRepository;
}
