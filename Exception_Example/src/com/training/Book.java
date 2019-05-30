package com.training;

public class Book {

	private long bookNumber;
	private String bookName;
	private String authorName;
	private double price;
	
	public Book() {
		super();
		}

	public Book(long bookNumber, String bookName, String authorName, double price)  throws RangeCheckException{
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.authorName = authorName;
		
		if(price<=0) {
			throw new RangeCheckException("Price Should be a Positive Number");
		} else {
		   this.price = price;
		}
	}

	public long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		if(price<0) {
			try {
				throw new RangeCheckException("Price Should be a Positive Number");
			} catch (RangeCheckException e) {
				e.printStackTrace();
			}
		} else {
		this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", authorName=" + authorName + ", price="
				+ price + "]";
	}
	
	
	
}
