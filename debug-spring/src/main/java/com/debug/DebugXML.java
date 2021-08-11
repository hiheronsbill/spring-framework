package com.debug;

import com.debug.config.AppConfig;
import com.debug.service.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DebugXML {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		A a = context.getBean("a", A.class);

		System.out.println(a);
	}
}
