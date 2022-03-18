package com.farrukh.simran.inheritance;

public class ReadyMeal implements BasketItem, FoodItem {

	private String cuisineType;
	private String name;
	private double price;
	private int calories;
	
	ReadyMeal(String name, double price, String cuisineType, int calories) {
		this.name = name;
		this.price = price;
		this.cuisineType = cuisineType;
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


	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	@Override
	public String toString() {
		return "\nMeal: "+name + " | Price: "+price + " | Cuisine: "+cuisineType +  " | Calories: "+calories;
		}
}
