package com.training;

public class Exception_Hirearchy {

	public static void main(String[] args) {

		
		try {
			
			int mark = Integer.parseInt(args[0]);
			int subjects = Integer.parseInt(args[1]);
			
			double average = mark/subjects;
			  
			  System.out.println(mark);
			  System.out.println(average);
			  
			  
		} catch (NumberFormatException e) {
			// Catch Number Format Exception
			System.err.println("Enter Mark in Numerals [0-9] not as a string [a-z]");
		}
		 catch(ArrayIndexOutOfBoundsException e) {
			 
			 // Catch Array Index Out of Bounds Exception
			System.err.println("Command Line argument should be passed - Check");
		 
		 }
		  catch(Exception e) {
			  
			  // Catch All other Exception than the two given above
			  // Order should from specific Exception to General 
			  // or From sub class to super class
			  System.err.println("Unknown Exception - check arguments");
		  }
	}

}
