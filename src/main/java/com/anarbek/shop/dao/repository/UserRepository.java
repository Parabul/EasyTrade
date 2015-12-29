package com.anarbek.shop.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anarbek.shop.dao.domain.entity.ShopUser;

@Repository
public interface UserRepository extends JpaRepository<ShopUser, Long> {

	ShopUser findByEmail(String email);
}