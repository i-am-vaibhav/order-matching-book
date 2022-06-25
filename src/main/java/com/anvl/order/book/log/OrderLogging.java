/**
 * 
 */
package com.anvl.order.book.log;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author vaibhavkgupta
 *
 */
@Aspect
@Component
public class OrderLogging {

	private final Logger log = LoggerFactory.getLogger(OrderLogging.class);

	@Around("execution(* com.anvl.order.book.service.OrderMatchingService.*(..))")
	public void log(ProceedingJoinPoint jp) {
		String methodSignature = jp.getSignature().toString();
		String arguments = Arrays.deepToString(jp.getArgs());
		log.info("Method signature {}", methodSignature);
		log.info("Arguments {}", arguments);
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		log.info("Order completed method {} arguments {}", methodSignature, arguments);
	}

}
