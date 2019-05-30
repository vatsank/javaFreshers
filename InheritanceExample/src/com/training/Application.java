package com.training;


public class Application {

	public static void main(String[] args) {

		
		Invoice  ram = new Invoice(101,"Ramesh",4500.00);
		
		
		System.out.println(ram.getInvoiceNumber());
		
		System.out.println(Invoice.getDiscount());
		
		System.out.println(ram);
	}

}
