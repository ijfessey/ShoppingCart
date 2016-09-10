package com.hmrc.cart;

public interface CartItem {

	String getDescription();

	void setDescription(String description);

	int getPriceInPence();

	void setPriceInPence(int priceInPence);

}