/**
 * 
 */
package com.anvl.order.book.service;

import org.springframework.http.ResponseEntity;

import com.anvl.order.book.model.Order;

/**
 * @author vaibhavkgupta
 *
 */
public interface OrderMatchingService {

	ResponseEntity<?> buyOrder(Order order);

	ResponseEntity<?> sellOrder(Order order);

}
