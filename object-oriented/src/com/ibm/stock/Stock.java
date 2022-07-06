package com.ibm.stock;

public class Stock implements Exchange {

	@Override
	public void get() {
		System.out.println("Get quote");
	}

	@Override
	public void view() {
		System.out.println("View quote");

	}

	@Override
	public void set() {
		System.out.println("Set quote");

	}

}
