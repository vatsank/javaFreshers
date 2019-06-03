package com.training;

public class CustomException {

	public static void main(String[] args) {

		
		Book painting=null;
		try {
			painting = new Book(101,"How to paint ","Nesamani",450.00);
		//	System.out.println(painting);

		} catch (RangeCheckException e) {
			e.printStackTrace();
		}

	     BookManager mgr = new BookManager();

	     Book java = new Book();
	     
		     java.setBookNumber(102);
		     java.setBookName("Head First Java");
		     java.setAuthorName("kathy sieera");
		     java.setPrice(200);
	     
	   
	     
	     
        Book html = new Book();
	     
		     html.setBookNumber(103);
		     html.setBookName("Head First HTML");
		     html.setAuthorName("kathy ");
		     html.setPrice(300);
	     
	     
	     mgr.addBook(painting);

	     mgr.addBook(html);
     
	     mgr.addBook(painting);
	     
	     mgr.addBook(html);
	    
	     mgr.addBook(painting);
	     
	   //  mgr.addBook(painting);

	     
	     mgr.printBooks();


	     GrowingBookManager growMgr = new GrowingBookManager();
	     
	         growMgr.addBook(java);
	         growMgr.addBook(html);
	         growMgr.addBook(java);
	         growMgr.addBook(html);
	         
	         growMgr.printBooks();
	         
	         
	}

}
