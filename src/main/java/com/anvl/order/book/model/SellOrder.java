package com.anvl.order.book.model;

import com.anvl.order.book.constants.OrderType;

public class SellOrder extends Order {

	private final OrderType type = OrderType.SELL;

	public OrderType getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
