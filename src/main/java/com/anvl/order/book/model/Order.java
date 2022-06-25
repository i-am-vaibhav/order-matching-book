/**
 * 
 */
package com.anvl.order.book.model;

/**
 * @author vaibhavkgupta
 *
 */
public abstract class Order {

	private String stockId;

	private String amt;

	private String time;

	private String quantity;

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



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderRequest [stockId=").append(stockId).append(", amt=").append(amt).append(", time=")
				.append(time).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}

}
