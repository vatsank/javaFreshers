package com.training;

public class LifeInsurance extends Insurance {

	
	
	public LifeInsurance(long policyNumber, String policyHolderName, short age) {
		super(policyNumber, policyHolderName,age);
	}


	@Override
	public double calculatePremium() {
	
		double premium = 2300.00;
		
		if(this.getAge() >18) {
			 premium = 3000;
		} 
		
		return premium;
	}
}
