package com.training;

public class FirstExample {

	public static void main(String[] args) {
	
		int   a = 5;
		int   b = 5;
		
		int c =0;

		try {
		
		//	 int  c = a/b;
				
			 c= a/b;
			
			// Line Below Gets Executed when THRE IS NO Exception
			   System.out.println(c);
			   
			   
		} catch (ArithmeticException e) {
			
			 // LineS Below Gets Executed when THRE IS  Exception

			System.out.println("Value of Denominator should not be zero");

			System.out.println(e.getMessage());
		}
		
		 // Line Below Gets Executed when THERE IS  Exception or NOT

		System.out.println("Thanks bye...");
	  
		System.out.println(c);
		
		
	}

}
