package com.training.domains;

import com.training.ifaces.RentalItem;

public class Application {

	public static void print(Item item) {
		
		
	}
	public static void main(String[] args) {

		
		RentalManager mgr = new RentalManager();
		
		 Item fan =(Item)mgr.getItem(1, 34, "Table Fan");
		 
		 
                 mgr.printRentalEstimate(fan);
 
		 
		  Item furniture = (Item)mgr.getItem(2, 2, "wooden Sofa");
		  

		   mgr.printRentalEstimate(furniture);
         
            	   
            
	}

}
