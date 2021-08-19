package com.restapi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Product;
import com.restapi.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//for adding one product
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	//for adding a lots products
	@PostMapping("/addProducts")
	public List<Product> addAllProducts(@RequestBody List<Product>products){
		return productService.saveAllProduct(products);
	}
	
	//for get product base on id
	@GetMapping("/productById/{id}")
	public Product getById(@PathVariable int id) {
		return productService.getById(id);
	}
	
	//for get product base on name
	@GetMapping("/productByName/{productName}")
	public Product getByName(@PathVariable String productName) {
		return productService.getByName(productName);
	}
	//for get all products
	@GetMapping("/allProducts")
	public List<Product>  getAllProduct() {
		return productService.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int productId) {
		return productService.deleteById(productId);
	}
	
	@PutMapping("update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	

}
