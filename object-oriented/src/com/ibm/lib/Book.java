package com.ibm.lib;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {

		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void status() {
		if (mbr == null) {
			System.out.println(title + " is not issued by any member");

		} else {
			System.out.println(title + " is issued to " + mbr.getName());
		}

	}

	public void issues(Member m) {
		this.mbr=m;
		m.setBook(this);
		System.out.println("Book issued ...");
	}

	public void returns(Member m) {
		mbr=null;
		m.setBook(null);
		System.out.println("Book returned ...");
	}
}
