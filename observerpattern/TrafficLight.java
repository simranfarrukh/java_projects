package com.fdmgroup.observer;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
	
	private LightType lightType;
	private List<TrafficLightObserver> observerslist;
	
	public TrafficLight() {
		super();
		lightType = new LightType(false, false);
		observerslist = new ArrayList<>();
	}
	
	
	public LightType getLightType() {
		return lightType;
	}


	public void setLightType(LightType lightType) {
		this.lightType = lightType;
	}


	public void addObserver(TrafficLightObserver lightObserver) {
		observerslist.add(lightObserver);
	}
	
	public void removeObserver(TrafficLightObserver lightObserver) {
		observerslist.remove(lightObserver);
	}
	
	public void updateOtherVehicles() {
		for (TrafficLightObserver trafficLightObserver : observerslist) {
			trafficLightObserver.updateLights(lightType);
		}
	}
	
}
