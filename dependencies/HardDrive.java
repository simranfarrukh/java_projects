package com.farrukhsimran.dependencies;



public class HardDrive {
	
	private final String MODEL; //final 
	private final double CAPACITY;
	double usedSpace = 0;
	
	//Constructor
	public HardDrive(String model, double capacity, double usedSpace) {
		this.MODEL = model;
		this.CAPACITY = capacity;
		this.usedSpace = usedSpace;
		}
	
	//getters
	public double getUsedSpace() {
		return usedSpace;
		}
	//setters
	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
		}
	
	//String method
	String readDATA(String file) {
		file = "data from " + file;
		return file;
		}
	
	//Void method
	void writeDate(String data, String file) {
		System.out.println(data + " " + file);
		}
	
	//toString
	@Override
	public String toString() {
	return "\nHard Drive: " + 
			"\nMODEL = " + MODEL + 
			"\nCAPACITY = " + CAPACITY +
			"\nusedSpace = " + usedSpace + "]";
	}
	
}