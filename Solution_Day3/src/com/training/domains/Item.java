package com.training.domains;

import com.training.ifaces.RentalItem;

public abstract class Item implements RentalItem {

	private int requiredDays;
	private double baseAmount;
	private double discount;
	private  double rentPerDay;
	private String itemName;
	
	
	public Item(String itemName,int requiredDays,double rentPerDay) {
		super();
		this.itemName = itemName;
		this.requiredDays = requiredDays;
		this.rentPerDay = rentPerDay;
	}


	public double getRentPerDay() {
		return rentPerDay;
	}


	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}


	public double getBaseAmount() {
		return baseAmount;
	}


	public double getDiscount() {
		return discount;
	}


	public int getRequiredDays() {
		return requiredDays;
	}


	public void setRequiredDays(int requiredDays) {
		this.requiredDays = requiredDays;
	}


	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



}
