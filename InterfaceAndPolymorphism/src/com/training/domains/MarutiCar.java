package com.training.domains;

import com.trainng.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getColor() {
		return "RED";
	}

	@Override
	public String getModel() {
		return "ALTO";
	}

	@Override
	public double getPrice() {
		return 400000;
	}

}
