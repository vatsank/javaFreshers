package com.training.domains;

import com.trainng.ifaces.Automobile;

public class ToyotoCar implements Automobile {

	@Override
	public String getColor() {
		return "Black";
	}

	@Override
	public String getModel() {
		return "fortunner";
	}

	@Override
	public double getPrice() {
		return 2500000;
	}

}
