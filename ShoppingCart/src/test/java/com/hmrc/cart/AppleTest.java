package com.hmrc.cart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppleTest {

	@Test
	public void shouldReturnAppleDescription_whenOneAppleCreated() {

		Apple apple = new Apple();
		apple.setDescription("Pink Lady");
		assertTrue(apple.getDescription().equals("Pink Lady"));
	}
	
	@Test
	public void shouldReturnApplePrice_whenOneAppleCreated() {

		Apple apple = new Apple();
		apple.setPriceInPence(60);
		assertTrue(apple.getPriceInPence() == 60 );
	}
}
