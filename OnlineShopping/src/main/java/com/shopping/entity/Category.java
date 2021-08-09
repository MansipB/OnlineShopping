package com.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int catId;

	@NotNull
	private String categoryName;

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category(int catId, String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}

	public Category() {

	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + "]";
	}

}