package com.hmrc.cart;

public class Bannana implements CartItem {

	private String description;
	private int priceInPence;
	private String colour;
	private int length;

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
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
