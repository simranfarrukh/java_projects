package com.farrukh.simran.observerpattern;

public class Runner {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		
		trafficLight.addObserver(new DomesticVehicle());
		trafficLight.addObserver(new CommercialVehicle());
		
		trafficLight.updateOtherVehicles();
		
		LightType typeLight = new LightType(false,true);
		trafficLight.setLightType(typeLight);
		
		trafficLight.updateOtherVehicles();
		
		typeLight.setGreenLightCommercial(true);
		typeLight.setGreenLightDomestic(false);
		
		trafficLight.setLightType(typeLight);
		
		trafficLight.updateOtherVehicles();
		
	}

}
