package com.anvl.order.book.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anvl.order.book.model.Order;
import com.anvl.order.book.service.OrderMatchingService;

@RestController
@RequestMapping("/order")
public class OrderController {

	private final OrderMatchingService orderMatchingService;

	public OrderController(OrderMatchingService orderMatchingService) {
		this.orderMatchingService = orderMatchingService;
	}

	@PostMapping("/buy")
	public ResponseEntity<?> buyOrder(@RequestBody Order request) {
		return orderMatchingService.buyOrder(request);
	}

	@PostMapping("/sell")
	public ResponseEntity<?> sellOrder(@RequestBody Order request) {
		return orderMatchingService.sellOrder(request);
	}

}
