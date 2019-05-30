package com.training;

import com.training.domains.NewShowRoom;
import com.training.domains.ShowRoom;
import com.trainng.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {

     int key = Integer.parseInt(args[0]);
		  ShowRoom abt = new NewShowRoom();
		  
		    Automobile auto =  abt.productFactory(key);
		    
		    if(auto!=null) {
		    abt.printQuotation(auto);
		    } else {
		    	
		    	System.out.println("Invalid Choice Enter 1-3");
		    }
		    
		
	}

}
