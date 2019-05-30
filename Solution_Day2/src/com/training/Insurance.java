package com.training;

public class Insurance {

	private long policyNumber;
	private String policyHolderName;
	private short age;


		
	public Insurance(long policyNumber, String policyHolderName, short age) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}




	public String getPolicyHolderName() {
		return policyHolderName;
	}




	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}




	public Insurance() {
		super();
	}

	public Insurance(long policyNumber, String policyHolderName) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	}




	public  double calculatePremium() {
		
		return 100.00;
	}


}
