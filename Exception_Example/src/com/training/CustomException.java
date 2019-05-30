package com.training;

public class CustomException {

	public static void main(String[] args) {

		
		Book painting;
		try {
			painting = new Book(101,"How to paint ","Nesamani",450.00);
			System.out.println(painting);

		} catch (RangeCheckException e) {
			e.printStackTrace();
		}

	     Book java = new Book();
	     
	     java.setBookNumber(102);
	     java.setBookName("Head First Java");
	     java.setAuthorName("kathy sieera");
	     java.setPrice(-200);
	     
	     System.out.println(java);
	     
	     
		
	}

}
