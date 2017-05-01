package com.hmrc.cart;

public interface CartItem {

	
	void setStockNumber(String stockNumber);

	String getStockNumber();
	
	
	String getDescription();

	void setDescription(String description);

	int getPriceInPence();

	void setPriceInPence(int priceInPence);

}