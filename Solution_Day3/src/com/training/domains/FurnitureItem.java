package com.training.domains;

import com.training.ifaces.RentalItem;

public class FurnitureItem extends Item implements RentalItem {


	public FurnitureItem(String itemName, int requiredDays, double rentPerDay) {
		super(itemName, requiredDays, rentPerDay);
	}

	@Override
	public double calculateRent() {
		setBaseAmount(getRequiredDays() * getRentPerDay());
		
		if(getRequiredDays()  > 30) {
 		 setDiscount(getBaseAmount() *.15);
 }
		
return getBaseAmount() -getDiscount();
	}

}
