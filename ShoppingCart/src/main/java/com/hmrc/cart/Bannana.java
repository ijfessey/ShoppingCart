package com.hmrc.cart;

public class Bannana implements CartItem {

	private String description;
	private int priceInPence;
	private String colour;
	private int length;
	private String weight;


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

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	@Override
	public void setStockNumber(String stockNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getStockNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
