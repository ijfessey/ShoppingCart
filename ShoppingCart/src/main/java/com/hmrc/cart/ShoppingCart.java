package com.hmrc.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
	
	public ShoppingCart() {
		setUp();
	}
	
	private Map<String,CartItem> shoppingItems = new HashMap<>();
	
	public void setUp() {
		
		Orange orange = new Orange();
		orange.setDescription("Satsuma");
		orange.setPriceInPence(25);
		shoppingItems.put("Orange", orange);

		Apple apple = new Apple();
		apple.setDescription("PinkLady");
		apple.setPriceInPence(60);
		shoppingItems.put("Apple", apple);
	}

	public List<CartItem> createItemList(String[] cartItemList) {
		List<CartItem> shoppingList = new ArrayList<CartItem>();
		
		
		for (String item : cartItemList) {
			shoppingList.add(shoppingItems.get(item));
		}
		
		return shoppingList;
	}

	public int checkOut(List<CartItem> cartItems) {

		int totalCost = 0;
		
		for (CartItem item : cartItems) {
			totalCost += item.getPriceInPence();
		}
		
		return totalCost;
	}
}
