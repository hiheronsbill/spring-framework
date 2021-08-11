package com.debug.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationContextAware implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {


		System.out.println("============================================");

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}

		System.out.println("============================================");


//		System.out.println("MyApplicationContextAware come in ......");
	}
}
