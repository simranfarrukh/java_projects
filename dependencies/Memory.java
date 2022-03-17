package com.farrukhsimran.dependencies;



public class Memory {
	
	final private String MODEL;
	final double CAPACITY;
	final double SPEED;
	double usedSpace;
	
	//Constructor
	Memory(String model,double capacity,double speed){
		this.MODEL = model;
		this.CAPACITY = capacity;
		this.SPEED = speed;
		}
	
	//getters
	public double getUsedSpace() {
		return usedSpace;
		}
	//setters
	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
		}
	//getters
	public String getMODEL() {
		return MODEL;
		}
	//getters
	public double getCAPACITY() {
		return CAPACITY;
		}
	//getters
	public double getSPEED() {
		return SPEED;
		}
	
	//Void method
	void storeData(String data) {
		System.out.println(data);
		}
	
	//toString
	@Override
	public String toString() {
		return "\nMemory: " +
				"\nSPEED = " + SPEED;
		}
	}