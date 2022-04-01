package com.fdmgroup.observer;

public class CommercialVehicle implements TrafficLightObserver{

	@Override
	public void updateLights(LightType lightType) {
		if(lightType.isGreenLightCommercial()) {
			System.out.println("All Commercial vehicles GO!!");
			}
			else {
				System.out.println("All Commercial vehicles STOP!!");
			}
		
	}
}
