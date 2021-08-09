package com.shopping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private Customer customer;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CartProductDetails", joinColumns = @JoinColumn(name = "cartId"), inverseJoinColumns = @JoinColumn(name = "productId"))
	private List<Product> products;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Cart(int cartId, Customer customer, List<Product> products) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.products = products;
	}

	public Cart() {

	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", products=" + products + "]";
	}

}