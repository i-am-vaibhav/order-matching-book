/**
 * 
 */
package com.anvl.order.book.util;

import com.anvl.order.book.constants.OrderType;
import com.anvl.order.book.entity.Order;

/**
 * @author vaibhavkgupta
 *
 */
public class OrderConverterUtil {

	public static Order convert(com.anvl.order.book.model.Order req, OrderType type) {
		Order order = new Order();
		order.setAmt(req.getAmt());
		order.setQuantity(req.getQuantity());
		order.setStockId(req.getStockId());
		order.setTime(req.getTime());
		order.setType(type);
		return order;
	}

}
