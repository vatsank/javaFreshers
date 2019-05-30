package com.training;

public class BankApplication {

	public static void main(String[] args) {
		
		
		SalaryAccount ramsAccount = new SalaryAccount(5000);
		
		System.out.println(ramsAccount.getBalance());
		

		 ramsAccount.deposit(3000);
		 
		
		 System.out.println(ramsAccount.getBalance());
		 
		 ramsAccount.withdraw(1000);
		 
		 System.out.println(ramsAccount.getBalance());
			
		 
		ramsAccount.withdraw(7000);
		
		System.out.println(ramsAccount.getBalance());
		
		
	
	}

}
