package com.training;

public class InsuranceAgent {

	public static void main(String[] args) {

		
		
		  Insurance rakesh = new LifeInsurance(192939, "Rakesh",(short)44);
		
		  System.out.println("Policy Bazzar");
		  System.out.println(rakesh.calculatePremium());
		  
		  
		  Insurance ramesh = new HealthInsurance(2020, "Ramesh",(short)20, true);
		  
		  System.out.println(ramesh.calculatePremium());
	      
		  System.out.println(Byte.MAX_VALUE);
		  
		  System.out.println(Short.MAX_VALUE);
		  
		  System.out.println(Integer.MAX_VALUE);
		  
	}

}
