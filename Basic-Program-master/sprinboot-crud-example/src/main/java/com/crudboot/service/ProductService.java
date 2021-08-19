package com.crudboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crudboot.entity.Product;
import com.crudboot.repository.ProductRepository;

@Service
public class ProductService {

	// service class talk directly ProductRepostiry interface
	@Autowired
	private ProductRepository productRepository;

	// save one product
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	// save all product
	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	// get all products
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	// get by id
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	// get by name
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}

	// delete Product on id bases
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "product removed !!  " + id;
	}

	// for update
	public Product updateProduct(Product product) {
		Product getId = productRepository.findById(product.getId()).orElse(null);
		getId.setName(product.getName());
		getId.setQuantity(product.getQuantity());
		getId.setPrice(product.getPrice());
		return productRepository.save(getId);
	}

}
