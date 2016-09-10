package com.hmrc.cart;

public class Orange implements CartItem {

	private String description;
	private int priceInPence;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriceInPence() {
		return priceInPence;
	}
	public void setPriceInPence(int priceInPence) {
		this.priceInPence = priceInPence;
	}
}
