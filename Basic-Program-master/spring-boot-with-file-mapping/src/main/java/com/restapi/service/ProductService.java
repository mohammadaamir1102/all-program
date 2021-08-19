package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dao.ProductRepository;
import com.restapi.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> saveAllProduct(List<Product> product){
		return productRepository.saveAll(product);
	}
	
	public Product getById(int productId) {
		return productRepository.findById(productId).orElse(null);
	}
	
	public Product getByName(String productName) {
		return productRepository.findByName(productName);
	}
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	public String deleteById(int productId) {
		productRepository.deleteById(productId);
		return "Deleted" +productId;
	}
	public Product updateProduct(Product products) {
		Product newProduct = productRepository.findById(products.getProductId()).orElse(null);
		newProduct.setProductId(products.getProductId());
		newProduct.setProductName(products.getProductName());
		newProduct.setProductQuantity(products.getProductQuantity());
		newProduct.setProductPrice(products.getProductPrice());
		return productRepository.save(newProduct);
		
	}

}
