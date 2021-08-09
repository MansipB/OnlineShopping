package com.shopping.service;

import java.util.List;

import com.shopping.entity.Product;

public interface ProductService {

	public Product addProduct(Product product);

	public List<Product> viewAllProducts();

	public Product viewProduct(int productId);

	public List<Product> viewProductByCategory(String categoryName);

	public Product updateProduct(int productId, Product product);

	public Product deleteProduct(int productId);
}
