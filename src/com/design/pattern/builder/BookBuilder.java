package com.design.pattern.builder;

public class BookBuilder {
	
	private String bookId;
	private String bookName;
	private String author;
	private String isdn;
	private double price;
	public String getBookId() {
		return bookId;
	}
	public BookBuilder setBookId(String bookId) {
		this.bookId = bookId;
		return this;
	}

	public BookBuilder setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}

	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}

	public BookBuilder setIsdn(String isdn) {
		this.isdn = isdn;
		return this;
	}

	public BookBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	
	public Book build() {
		return new Book(bookId, bookName, author, isdn, price);
	}
	
	

}
