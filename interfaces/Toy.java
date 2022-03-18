package com.farrukh.simran.inheritance;

public class Toy implements BasketItem {

	private int minAge;
	private int maxAge;	
	private String name;
	private double price;
	
	public Toy(String name, double price, int minAge, int maxAge) {
		this.name = name;
		this.price = price;
		this.minAge = minAge;
		this.maxAge = maxAge;
		
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

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	
	@Override
	public String toString() {
		return " \nToy: "+name + " | Price: "+price + " | MinAge: "+minAge + " | MaxAge: "+maxAge;
		}
	
	

}
