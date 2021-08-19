package com.crudboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudboot.entity.Product;
import com.crudboot.service.ProductService;

@RestController
public class ProductController {

	// ProductController directly talk or PorductService for using method of service
	// class
	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return productService.getProducts();
	}

	@GetMapping("/productById/{id}")
	//ResponseEntity is a child class of httpStatus use for customize response status
	//here build for making proper object
	public ResponseEntity<Product> findProductById(@PathVariable int id) {
		 Product productById = productService.getProductById(id);
		 if(productById==null) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 return ResponseEntity.of(Optional.of(productById));
	}

	@GetMapping("/productByName/{name}")
	public Product findProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}

}
