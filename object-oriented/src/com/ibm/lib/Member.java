package com.ibm.lib;

public class Member {
	private String name;
	private Book bk;

	public Member(String name) {
		super();
		this.name = name;
	}
	
	public void setBook(Book bk) {
		this.bk = bk;
	}

	public String getName() {
		return name;
	}

	public void status() {
		if (bk == null) {
			System.out.println(name + " has not issued any book");
		}
		else {
			System.out.println(name + " has issued " + bk.getTitle());
		}
	}

}
