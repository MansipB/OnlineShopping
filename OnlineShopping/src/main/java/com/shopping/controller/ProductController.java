package com.shopping.controller;

import java.util.List;

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

import com.shopping.entity.Product;
import com.shopping.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/products")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> viewAllProducts() {
		return ResponseEntity.ok(productService.viewAllProducts());
	}

	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> viewProduct(@PathVariable("productId") int productId) {
		return ResponseEntity.ok(productService.viewProduct(productId));
	}

	@GetMapping("/products/category/{categoryName}")
	public ResponseEntity<List<Product>> viewProductsBycategory(@PathVariable("categoryName") String categoryName) {
		return ResponseEntity.ok(productService.viewProductByCategory(categoryName));
	}

	@PutMapping("/products/{productId}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product,
			@PathVariable("productId") int productId) {
		return ResponseEntity.ok(productService.updateProduct(productId, product));
	}

	@DeleteMapping("/products/{productId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("productId") int productId) {
		return ResponseEntity.ok(productService.deleteProduct(productId));
	}

}
