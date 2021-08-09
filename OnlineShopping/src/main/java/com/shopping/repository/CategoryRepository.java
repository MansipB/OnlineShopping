package com.shopping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	public Optional<Category> findByCategoryName(String categoryName);

}
