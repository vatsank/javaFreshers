package com.training.domains;

import com.training.ifaces.RentalItem;

public class RentalManager {

	
	
	public RentalItem  getItem(int key,int reqDays,String model) {
		
		
		switch (key) {
		case 1:
			
			return new Fan(reqDays,model,30.00);

		case 2:
			 return new ReceptionSofa(reqDays, model, 70.00);
		default:
			return null;
		}
	}
	
	public void  printRentalEstimate(RentalItem obj) {
		
		if(obj instanceof Item) {
			
		
         Item item = (Item)obj;		
		
         System.out.println("Item Name :="+ item.getItemName());
		System.out.println("Rent Duration:="+item.getRequiredDays());
 	   System.out.println("Rent Per Day :="+item.getRentPerDay());
 	   System.out.println("Gross Rent :="+item.getBaseAmount());
 	   System.out.println("Discount :="+item.getDiscount());
 	   System.out.println("Rent Amount:="+item.calculateRent());
		} else {
		 System.out.println(" ============= Invalid Choice ================");	
		}
		
	}
}
