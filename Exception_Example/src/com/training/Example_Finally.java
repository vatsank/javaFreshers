package com.training;

public class Example_Finally {

	public static int findLength(String word) {
		int length =0;
		try {
	
			length= word.length();
			
		} catch (NullPointerException e) {
		

			System.err.println("Argument Word passed to the method  is Null - check that");
			
			return 5;

		}
		finally {
			System.out.println("Inside Finally Block");
		}
		
		System.out.println("Outside finally Block");
		return length;
	}
	
	public static void main(String[] args) {

//		String name = "Ramesh";
//		
//		System.out.println(findLength(name));
		
		String address =null;
		
		System.out.println(findLength(address));
		
	}

}
