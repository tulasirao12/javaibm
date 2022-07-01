package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="cust_id")
	private int custId;
	@Column(name="cname")
	private String custName;
	@Column(name="cr_limit")
	private double creditLimit;
	
	
	
	//constructors
	public Customer() {
		
	}
	public Customer(int custId, String custName, double creditLimit) {
		
		this.custId = custId;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	
	
	//Getters and Setters
	
	public int getCust_id() {
		return custId;
	}
	public void setCust_id(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
}
