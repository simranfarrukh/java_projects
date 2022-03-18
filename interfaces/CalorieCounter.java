package com.farrukh.simran.inheritance;

import java.util.ArrayList;

public class CalorieCounter {

	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();
	
	public ArrayList<FoodItem> getBasketItems() {
		return lowCalorieFoods;
	}
	
	public CalorieCounter(){;
	}

	public void addItem(FoodItem foodItem) {
		if (foodItem.getCalories() <= 500) {
			lowCalorieFoods.add(foodItem);
		}
	}
	
	public ArrayList<FoodItem> getAllItems(){
		System.out.println(lowCalorieFoods);
		return(lowCalorieFoods);
	}
}
