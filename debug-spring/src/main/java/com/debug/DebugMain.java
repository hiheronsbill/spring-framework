package com.debug;

import com.debug.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhxy
 * @date 2021/3/30 - 10:42 下午
 */
public class DebugMain {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DebugConfig.class);

		OrderService orderService = context.getBean("orderService", OrderService.class);

		orderService.test();

	}
}
