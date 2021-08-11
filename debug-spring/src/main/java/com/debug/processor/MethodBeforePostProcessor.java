package com.debug.processor;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhxy
 * @Date 2021/5/25 8:17 下午
 */

//@Component
public class MethodBeforePostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if("a".equals(beanName)){
			ProxyFactory proxyFactory = new ProxyFactory(bean);

			proxyFactory.addAdvice(new MethodBeforeAdvice() {
				@Override
				public void before(Method method, Object[] args, Object target) throws Throwable {
					System.out.println("hello,a");
				}
			});
			return proxyFactory.getProxy();
		}

		return bean;
	}
}
