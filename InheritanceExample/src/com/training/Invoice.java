package com.training;

public class Invoice  {

	private long invoiceNumber;
	private String customerName;
	private double amount;
	
	private static double discount = 0.10;
	
	static {
		
		System.out.println("Inside Static");
	}
	
	public Invoice() {
		super();
		
		System.out.println("Inside Constructor");
	}

	public Invoice(long invoiceNumber, String customerName, double amount) {
		

		super();
		
		System.out.println("Inside Constructor");

		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.amount = amount;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static double getDiscount() {
	 //	double amount     => Should be initialized before use
		
		double amount =5.0;
		System.out.println(amount);
		System.out.println(discount);
		return discount;
	}

	@Override
	public String toString() {
		return  this.customerName + ":"+this.invoiceNumber;
	}
	
}
