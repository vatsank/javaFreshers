package com.training;

public class SalaryAccount extends BankAccount {

	public SalaryAccount(double balance) {
		super(balance);
	}

	@Override   
	public double withdraw(double amount) {
                                                          
		
		   double currentBalance = getBalance()-amount;
		   
		   if(currentBalance>1000) {
			   
			   return super.withdraw(amount);
		   } else {
			   System.out.println("Insufficent Balance - Cannot withdraw");
			   return getBalance();
		   }
	
	}

	
	
}
