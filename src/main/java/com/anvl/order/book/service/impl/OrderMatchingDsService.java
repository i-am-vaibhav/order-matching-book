package com.anvl.order.book.service.impl;

import static com.anvl.order.book.constants.OrderType.BUY;
import static com.anvl.order.book.constants.OrderType.SELL;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anvl.order.book.entity.Order;
import com.anvl.order.book.model.BuyOrder;
import com.anvl.order.book.model.SellOrder;
import com.anvl.order.book.service.OrderMatchingService;
import com.anvl.order.book.util.OrderConverterUtil;

@Service
public class OrderMatchingDsService implements OrderMatchingService {

	private Set<Order> sellSet;

	private Set<Order> buySet;

	public OrderMatchingDsService() {
		sellSet = new HashSet<>();
		buySet = new HashSet<>();
	}

	@Override
	public ResponseEntity<?> buyOrder(BuyOrder order) {
		buySet.add(OrderConverterUtil.convert(order, BUY));
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<?> sellOrder(SellOrder order) {
		sellSet.add(OrderConverterUtil.convert(order, SELL));
		return ResponseEntity.ok().build();
	}

}
