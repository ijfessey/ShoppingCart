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
