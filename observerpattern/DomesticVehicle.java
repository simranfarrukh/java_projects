package com.fdmgroup.observer;

public class DomesticVehicle implements TrafficLightObserver {


	@Override
	public void updateLights(LightType lightType) {
		if(lightType.isGreenLightDomestic()) {
		System.out.println("All Domestic vehicles GO!!");
		}
		else {
			System.out.println("All Domestic vehicles STOP!!");
		}
	}
}
