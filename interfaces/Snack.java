package com.farrukh.simran.inheritance;

public class Snack implements BasketItem, FoodItem{

	private int fatContent;
	private int sugarContent;
	private int calories;
	private String name;
	private double price;
	
	Snack(String name, double price, int fatContent, int sugarContent, int calories) {
		this.name = name;
		this.price = price;
		this.fatContent = fatContent;
		this.sugarContent = sugarContent;
		this.calories = calories;
	}	
	
	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	public int getFatContent() {
		return fatContent;
	}

	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
	@Override
	public String toString() {
		return " \nSnack: "+name + " | Price: "+price + " | Fat Content: "+fatContent +  " | Calories: "+calories;
		}

}
