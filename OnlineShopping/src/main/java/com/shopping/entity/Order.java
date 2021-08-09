package com.shopping.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "`Orders`")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

	@NotNull
	private LocalDate orderDate;

	@NotNull
	private String orderStatus;

	@OneToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	@OneToMany
	@JoinTable(name = "OrderProductDetails", joinColumns = @JoinColumn(name = "orderId"), inverseJoinColumns = @JoinColumn(name = "productId"))
	private List<Product> productList = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "addressId")
	private Address address;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Order() {
		super();
	}

}