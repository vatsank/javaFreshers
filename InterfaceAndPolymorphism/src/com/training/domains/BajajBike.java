package com.training.domains;

import com.trainng.ifaces.Automobile;

public class BajajBike implements Automobile {

	@Override
	public String getColor() {
		return "Blue";
	}

	@Override
	public String getModel() {
		return "RS200";
	}

	@Override
	public double getPrice() {
		return 128000;
	}

}
