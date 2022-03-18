package com.farrukh.simran.inheritance;

public class Laptop implements BasketItem {
	
	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	private String name;
	private double price;
	
	Laptop(String name, double price, double cpuSpeed, double memory, double hardDrive) {
		this.name = name;
		this.price = price;
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getCpuSpeed() {
		return cpuSpeed;
	}
	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	public double getMemory() {
		return memory;
	}
	public void setMemory(double memory) {
		this.memory = memory;
	}
	public double getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
	}
	
	@Override
	public String toString() {
		return " \nLaptop: "+name + " | Price: "+price + " | Speed: "+cpuSpeed + " | Memory: "+memory + " | HardDrive: "+hardDrive;
		}


}
