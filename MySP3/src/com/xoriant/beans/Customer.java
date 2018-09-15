package com.xoriant.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;
	private int custID;
	
	@Autowired
	private Order order;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", custID=" + custID + ", order=" + order + "]";
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
