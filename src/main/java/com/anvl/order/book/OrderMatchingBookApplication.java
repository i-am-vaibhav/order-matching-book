package com.anvl.order.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class OrderMatchingBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMatchingBookApplication.class, args);
	}

}
