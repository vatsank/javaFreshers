package com.training.domains;

import com.training.ifaces.RentalItem;

public abstract class ElectricalItem extends Item  implements RentalItem {


	
	public ElectricalItem(int requiredDays,String modelName,double rentPerDay) {
		super(modelName,requiredDays,rentPerDay);
	}


	@Override
	public double calculateRent() {
		
		setBaseAmount(getRequiredDays() * getRentPerDay());
		
				if(getRequiredDays()  > 30) {
	     		 setDiscount(getBaseAmount() *.10);
		 }
				
		return getBaseAmount() -getDiscount();
	}


	
	
}
