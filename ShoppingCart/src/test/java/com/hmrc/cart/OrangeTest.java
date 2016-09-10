package com.hmrc.cart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrangeTest {

	@Test
	public void shouldReturnOrangeDescription_whenOneOrangeCreated() {

		Orange orange = new Orange();
		orange.setDescription("Satsuma");
		assertTrue(orange.getDescription().equals("Satsuma"));
	}
	
	@Test
	public void shouldReturnOrangePrice_whenOneOrangeCreated() {

		Orange orange = new Orange();
		orange.setPriceInPence(25);
		assertTrue(orange.getPriceInPence() == 25 );
	}
}
