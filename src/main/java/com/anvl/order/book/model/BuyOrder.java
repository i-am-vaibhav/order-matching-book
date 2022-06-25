package com.anvl.order.book.model;

import com.anvl.order.book.constants.OrderType;

public class BuyOrder extends Order {

	private final OrderType type = OrderType.BUY;

	public OrderType getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
