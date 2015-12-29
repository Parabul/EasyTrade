package com.anarbek.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.anarbek.shop")
public class EasytradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasytradeApplication.class, args);
	}

}
