package com.anvl.order.book.service.impl;

import static com.anvl.order.book.constants.OrderType.BUY;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.anvl.order.book.model.Order;
import com.anvl.order.book.service.OrderMatchingService;
import com.anvl.order.book.util.OrderConverterUtil;

@Service
public class OrderMatchingDsService implements OrderMatchingService {

	private Set<com.anvl.order.book.entity.Order> sellSet;

	private Set<com.anvl.order.book.entity.Order> buySet;

	public OrderMatchingDsService() {
		sellSet = new HashSet<>();
		buySet = new HashSet<>();
	}

	@Override
	public ResponseEntity<?> buyOrder(Order order) {
		com.anvl.order.book.entity.Order convert = OrderConverterUtil.convert(order, BUY);
		return findMatchingStock(convert, buySet, sellSet);

	}

	@Override
	public ResponseEntity<?> sellOrder(Order order) {
		com.anvl.order.book.entity.Order convert = OrderConverterUtil.convert(order, BUY);
		return findMatchingStock(convert, sellSet, buySet);
	}

	private ResponseEntity<?> findMatchingStock(com.anvl.order.book.entity.Order convert,
			Set<com.anvl.order.book.entity.Order> addableSet, Set<com.anvl.order.book.entity.Order> searchableSet) {
		addableSet.add(convert);
		if (searchableSet.contains(convert)) {
			return ResponseEntity
					.ok(searchableSet.parallelStream().filter(or -> or.equals(convert)).findFirst().orElse(null));
		}
		return ResponseEntity.notFound().build();
	}

}
