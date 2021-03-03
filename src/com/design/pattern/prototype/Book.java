package com.design.pattern.prototype;

public class Book implements Cloneable {
	
	private String bookId;
	private String bookName;
	private String author;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
	@Override
	protected Book clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Book cloneBook= new Book();
		cloneBook.setAuthor(this.getAuthor());
		cloneBook.setBookId(this.getBookId());
		cloneBook.setBookName(this.getBookName());
		return cloneBook;
	}
	
	
	
	
	
	
	

}
