package com.training.domains;

import com.trainng.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile productFactory(int key) {
		
		if(key==3) {
			return new ToyotoCar();
		} else {

		return super.productFactory(key);
	    }
	}
	
}
