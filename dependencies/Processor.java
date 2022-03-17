package com.farrukhsimran.dependencies;



public class Processor {
	
	final private String MODEL;
	final private double SPEED;
	final private int NUMBER_OF_CORES;
	
	//Constructor
	Processor(String Model, double speed, int numberOfCores){
		this.MODEL = Model;
		this.SPEED = speed;
		this.NUMBER_OF_CORES = numberOfCores;
		}
	
	//getters
	public String getModel() {
		return MODEL;
		}
	//getters
	public double getSpeed() {
		return SPEED;
		}
	//getters
	public int getNumberOfCores() {
		return NUMBER_OF_CORES;
		}	
	
	//Void method
	void processData(String data) {
		System.out.println(data);
		}
	
	//toString
	@Override
	public String toString() {
		return "\nProcessor: "+ 
				"\nMODEL = " + MODEL + 
				"\nNUMBER_OF_CORES = " + NUMBER_OF_CORES;
		}
	}