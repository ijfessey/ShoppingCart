package com.hmrc.cart;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShoppingCartTest {

	ShoppingCart shoppingCart = new ShoppingCart();
	
	
	@Test
	public void shouldReturnTwoCartItemsInShoppingList_whenOneOrangeandOneAppleCreatedAtCheckout() {
		String [] shoppingItemList = {"Apple", "Orange"};
		List<CartItem> shoppingItemListAsCartItems = shoppingCart.createItemList(shoppingItemList);

		assertTrue(shoppingItemListAsCartItems.size() == 2);
	}
	
	@Test
	public void shouldReturnFourCartItemsInShoppingList_whenOneOrangeandOneAppleCreatedAtCheckout() {
		String [] shoppingItemList = {"Apple", "Apple","Orange","Apple"};
		List<CartItem> shoppingItemListAsCartItems = shoppingCart.createItemList(shoppingItemList);

		assertTrue(shoppingItemListAsCartItems.size() == 4);
	}
	
	@Test
	public void shouldReturnTotalCostOfCartItems_whenOneOrangeCreatedInCheckout() {

		List<CartItem> cartItemList = new ArrayList<>();
		Orange orange = new Orange();
		orange.setPriceInPence(25);
		cartItemList.add(orange);
		int totalCost = shoppingCart.checkOut(cartItemList);
		
		assertTrue(totalCost == 25);
	}

	@Test
	public void shouldReturnTotalCostOfCartItems_whenOneAppleCreatedInCheckout() {

		List<CartItem> cartItemList = new ArrayList<>();
		Apple apple = new Apple();
		apple.setPriceInPence(60);
		cartItemList.add(apple);
		int totalCost = shoppingCart.checkOut(cartItemList);
		
		assertTrue(totalCost == 60);
	}
	
	@Test
	public void shouldReturnTotalCostOfCartItems_whenOneAppleAndTwoOrangesCreatedInCheckout() {

		List<CartItem> cartItemList = new ArrayList<>();
		Apple apple = new Apple();
		apple.setPriceInPence(60);
		cartItemList.add(apple);
		
		Orange orange = new Orange();
		orange.setPriceInPence(25);
		cartItemList.add(orange);
		cartItemList.add(orange);
		
		
		int totalCost = shoppingCart.checkOut(cartItemList);
		
		assertTrue(totalCost == 110);
	}

	@Test
	public void shouldTotalCostOfShoppingList_whenOneOrangeandOneAppleCreatedAtCheckout() {
		String [] shoppingItemList = {"Apple", "Orange"};
		List<CartItem> shoppingItemListAsCartItems = shoppingCart.createItemList(shoppingItemList);
		int checkoutTotal = shoppingCart.checkOut(shoppingItemListAsCartItems);
		assertTrue( checkoutTotal == 85);
	}
	
	@Test
	public void shouldTotalCostOfShoppingList_whenMultipleItemsCreatedAtCheckout() {
		String [] shoppingItemList = {"Apple", "Apple","Orange","Apple"};
		List<CartItem> shoppingItemListAsCartItems = shoppingCart.createItemList(shoppingItemList);
		int checkoutTotal = shoppingCart.checkOut(shoppingItemListAsCartItems);
		assertTrue( checkoutTotal == 205);
	}	
	
	
}
