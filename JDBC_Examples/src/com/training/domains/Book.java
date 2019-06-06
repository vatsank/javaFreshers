package com.training.domains;

public class Book {
	private long bookNumber;
	private String bookName;
	private String category;
	private Author author;
	private double price;
	
	public Book() {
		super();
		}

	public Book(long bookNumber, String bookName, Author author, double price)  throws RangeCheckException{
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		
		if(price<=0) {
			throw new RangeCheckException("Price Should be a Positive Number");
		} else {
		   this.price = price;
		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(long bookNumber, String bookName, String category, Author author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.category = category;
		this.author = author;
		this.price = price;
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

	public Author getAuthorName() {
		return author;
	}

	public void setAuthorName(Author authorName) {
		this.author = authorName;
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
		return "Book [bookNumber=" + bookNumber + ", bookName=" +
	              bookName + ", author=" + author + ", price="
				+ price + "]";
	}
	
	
	
}
