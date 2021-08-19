package com.crudboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

	

}
