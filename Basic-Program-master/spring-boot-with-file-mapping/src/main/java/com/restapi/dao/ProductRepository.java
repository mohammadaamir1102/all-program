package com.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String productName);

}
