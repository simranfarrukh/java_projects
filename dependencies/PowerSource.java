package com.farrukhsimran.dependencies;

public class PowerSource {

	double watts;

	public PowerSource(double watts) {
		this.watts = watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}
	
	public double supplyPower() {
		return watts;

	}
	
	
}
