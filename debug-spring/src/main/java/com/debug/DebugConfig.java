package com.debug;

import com.debug.config.AppConfig;
import com.debug.service.A;
import com.debug.service.B;
import com.debug.service.CalMath;
import com.debug.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhxy
 * @date 2021/3/30 - 10:42 下午
 */
public class DebugConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CalMath calMath = context.getBean(CalMath.class);
		calMath.div(1, 1);

//		A a = context.getBean("a", A.class);
//		B b = context.getBean("b", B.class);
//
//		System.out.println("a=====================");
//		a.m();
//		System.out.println("b=====================");
//		b.m();
//		System.out.println("======================");
//		System.out.println(b.getA() == a);
	}
}
