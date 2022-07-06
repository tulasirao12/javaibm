package com.ibm.shop;

public class ShoppingCart {
	private Product[] products;
	private double total;
	private int idx;
	public ShoppingCart() {
		products = new Product[5];
	}
	public void addToCart(Product p) throws CartException {
		if(idx == products.length) {
			System.out.println("Your cart is full");
		}else {
			products[idx ++] = p;
			total += p.getPrice();
			System.out.println("Product added.");
		}
	}
	public  void checkOut() {
		System.out.println("Products in your cart");
		for(int i=0;i<idx;i++) {
			products[i].description();
			System.out.println("Cart Total: "+total);
		}
	}
	
}
