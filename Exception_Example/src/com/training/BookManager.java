package com.training;

public class BookManager {

	private Book[] bookList;

	private int MAX_SIZE = 5;
	private int MIN_SIZE =0;
	
	public BookManager() {
		super();
	     this.bookList = new Book[MAX_SIZE];
	     
	}
	
		public int  addBook(Book book) {
		
			// If Max Size exceeds  should create a new array with old elements and new book
			// use 
			if(MIN_SIZE<MAX_SIZE) {
				this.bookList[MIN_SIZE]= book;
				MIN_SIZE++;
			} else {
		
				 throw new RuntimeException("Size Exhausted");
			}
		
		
		return 1;
	}
	
	public void printBooks() {
		
		
		for(int i =0;i<MAX_SIZE;i++) {
			
			System.out.println(i+","+this.bookList[i]);
		}
	}
}
