package com.anvl.order.book.entity;

import java.util.Objects;

import com.anvl.order.book.constants.OrderType;

public class Order {

	private String stockId;

	private String amt;

	private String time;

	private String quantity;

	private OrderType type;

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public OrderType getType() {
		return type;
	}

	public void setType(OrderType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amt, quantity, stockId, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(amt, other.amt) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(stockId, other.stockId) && Objects.equals(time, other.time);
	}

}