package com.training;

public class JewelLoan extends Loan {

	private double weightInGrams;
	
	
	
	public JewelLoan(String customerName, long mobileNumber, double weightInGrams) {
		super(customerName, mobileNumber);
		this.weightInGrams = weightInGrams;
	}
	
	

	public JewelLoan(String customerName, long mobileNumber,  double tenure,
			double weightInGrams) {
		super(customerName, mobileNumber, tenure);
		this.weightInGrams = weightInGrams;
	}



	@Override
	public double calculateInterest() {
     		return  (findEligibility() * getRateOfInterest() * getTenure())/100;
	}

	@Override
	public double findEligibility() {
	
			 
		return weightInGrams * 2000;
	}

	
}
