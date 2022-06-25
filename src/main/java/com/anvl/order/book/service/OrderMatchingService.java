/**
 * 
 */
package com.anvl.order.book.service;

import org.springframework.http.ResponseEntity;

import com.anvl.order.book.model.BuyOrder;
import com.anvl.order.book.model.SellOrder;

/**
 * @author vaibhavkgupta
 *
 */
public interface OrderMatchingService {

	ResponseEntity<?> buyOrder(BuyOrder order);
	
	ResponseEntity<?> sellOrder(SellOrder order);
	
}
