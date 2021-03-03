package com.design.pattern.prototype;

public class Driver {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book();
		book.setBookId("bookone");
		book.setBookName("Madhushala");
		book.setAuthor("Bachchan");
		
		
		
		Book book2=(Book) book.clone();
		book2.setBookId("booktwo");
		
		book.setAuthor("Harivansh");
		
		
		System.out.println(book);
		System.out.println(book2);
	}
	

}
