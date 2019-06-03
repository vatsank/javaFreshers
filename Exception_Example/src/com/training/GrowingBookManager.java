package com.training;

import java.util.Arrays;

public class GrowingBookManager {

	
	private Book[] bookList;
    
    private int size = 0;
    
    private static final int CAPACITY = 2;
    
	public GrowingBookManager() {
		super();
           this.bookList = new Book[CAPACITY];
	}

    public void addBook(Book book) {
        if (size == this.bookList.length) {
            increseCapacity();
        }
        this.bookList[size++] = book;
    }


    private void increseCapacity() {
        int newSize = this.bookList.length * 2;
        this.bookList = Arrays.copyOf(this.bookList, newSize);
    }

	public void printBooks() {
		
		
		for(Book bk:bookList) {
			
			System.out.println(bk);
		}
	}
	
}
