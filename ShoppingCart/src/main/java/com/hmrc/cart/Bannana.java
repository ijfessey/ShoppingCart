package com.hmrc.cart;

public class Bannana implements CartItem {

	private String description;
	private int priceInPence;
	private String colour;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriceInPence() {
		return priceInPence;
	}
	public void setPriceInPence(int price) {
		this.priceInPence = price;
		
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	

}
