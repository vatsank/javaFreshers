package com.training;

public class HealthInsurance  extends Insurance{

	
	private boolean preExisitingDiesease;

	
	public HealthInsurance(long policyNumber, String policyHolderName, short age, boolean preExisitingDiesease) {
		super(policyNumber, policyHolderName, age);
		this.preExisitingDiesease = preExisitingDiesease;
	}


	@Override
	public double calculatePremium() {
		
		double premium =super.calculatePremium();
		
		if(this.getAge()<18 && preExisitingDiesease) {
			
			premium = 2000;
		
		} else {
			
			premium = 3000;
		}
		
		if(this.getAge()>18 && preExisitingDiesease) {
			
			   premium = 4000;
		}
		
			return premium;
	}
	
	
}
