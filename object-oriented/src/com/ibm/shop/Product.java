package com.ibm.shop;
public class Product {
	private String name;
	private double price;
	public Product() {
		
	}
	public Product(String name, double price) {
	
		this.name = name;
		this.price = price;
	}
	public void description() {
		System.out.println("Product Name : "+name);
		System.out.println("product Price: "+price);
	}
	public double getPrice() {
		return price;
	}
	
	
}