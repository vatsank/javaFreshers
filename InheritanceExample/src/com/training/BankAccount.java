package com.training;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	
	public double deposit(double amount) {
		
		this.balance = this.balance + amount;
		
		return this.balance;
	}
	
	public double withdraw(double amount) {
		
         this.balance = this.balance - amount;
		
		return this.balance;
		
	}


	public double getBalance() {
		return balance;
	}


	
	
	
}
