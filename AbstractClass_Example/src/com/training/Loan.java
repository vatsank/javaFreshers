package com.training;


public abstract class Loan {

	private String customerName;
	private long mobileNumber;
	
	private double principle;
	private double rateOfInterest=5.0;
	private double tenure;
	
	
	// We can Provide Constructor BUT we cannot Instantiate

	public Loan(String customerName, long mobileNumber, double tenure) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.tenure = tenure;
	}

	public double getPrinciple() {
		return principle;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public double getTenure() {
		return tenure;
	}

	public Loan(String customerName, long mobileNumber) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}
	// Abstract Method MUST Only be in An Abstract Class
	
	public abstract double calculateInterest();
	public abstract double findEligibility();
	
	// Abstract class can have concrete method
	
	public String sayHello() {
		
		return "Hi From Super Class";
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}
	
	
}
