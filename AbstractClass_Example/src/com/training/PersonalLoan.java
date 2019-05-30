package com.training;

public  class PersonalLoan extends Loan {

	private double monthlySalary;
	
	
	
	public PersonalLoan(String customerName, long mobileNumber, double monthlySalary) {
		super(customerName, mobileNumber);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateInterest() {
		return 0;
	}

	@Override
	public double findEligibility() {
		return monthlySalary * 32;
	}

	
}
