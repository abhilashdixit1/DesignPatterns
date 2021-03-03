package com.design.pattern.builder;

public class Driver {
	
	public static void main(String[] args) {
		
		
		//Creating book object using constructor, so the constraint is we have to pass all the arguments even if 
		//we don't want and also we need to pass them in correct order. We can eliminate this restriction using Builder pattern below
		Book book =new Book("bookone", "Madhushala", "Bachchan", "1234xyz", 250.0);
		
		System.out.println(book);
		
		
		//Building Object using Builder
		
		Book newBook = new BookBuilder().setAuthor("Harivansh").build();
		
		System.out.println(newBook);
	}

}
