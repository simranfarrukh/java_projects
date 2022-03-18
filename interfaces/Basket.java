package com.farrukh.simran.inheritance;

import java.util.ArrayList;

public class Basket {
	private ArrayList<BasketItem> basketItems = new ArrayList<BasketItem>();

	public ArrayList<BasketItem> getBasketItems() {
		return basketItems;
	}

	public void addItem(BasketItem basketItem) {
		basketItems.add(basketItem);

	}
	
	public void removeItem(BasketItem basketItem) {
		basketItems.remove(basketItem);

	}
	
	public ArrayList<BasketItem> getAllItems(){
		System.out.println(basketItems);
		return basketItems;
	}
	
	
}
