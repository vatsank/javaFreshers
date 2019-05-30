package com.training.domains;

import com.trainng.ifaces.Automobile;

public class ShowRoom {

	
	public void printQuotation(Automobile polyAuto) {
		
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getPrice());
	
		
	}
	
	
	public Automobile productFactory(int key) {
		
		switch (key) {
		case 1:
			
			return new MarutiCar();
		case 2:
			  return new BajajBike();
		default:
			 return null;
		}
		
	}
}
