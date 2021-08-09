package com.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entity.Category;
import com.shopping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findProductByCategory(Category category);
}
