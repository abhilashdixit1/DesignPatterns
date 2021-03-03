package com.design.pattern.builder;

public class Book {
	
	private String bookId;
	private String bookName;
	private String author;
	private String isdn;
	private double price;
	
	
	public Book(String bookId, String bookName, String author, String isdn, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.isdn = isdn;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", isdn=" + isdn
				+ ", price=" + price + "]";
	}

}
