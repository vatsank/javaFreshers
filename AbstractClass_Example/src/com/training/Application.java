package com.training;

public class Application {

	
	public static void printEligibility(Loan loan) {
		
		double loanAmount =loan.findEligibility();
		
		double interst = loan.calculateInterest();
		
		System.out.println(loanAmount);
		
		System.out.println("Interest"+interst);
		
	}
	public static void main(String[] args) {

		
		JewelLoan loan1 = new JewelLoan("Ramesh",9484848,2,20);
		
		 printEligibility(loan1);
		 
		 
		
		PersonalLoan loan2 = new PersonalLoan("Rajesh",4949492, 25000);
		
		printEligibility(loan2);

		
		
	}

}
