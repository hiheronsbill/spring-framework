package com.debug.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AopAspect {

	@Pointcut("execution( * com.debug.service.CalMath.*(..))")
	public void pointCut() {
	}


	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + "----before" );
	}

	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + "----after");
	}


	@AfterReturning(value = "pointCut()")
	public void returning(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + "----returning");
	}


	@AfterThrowing(value = "pointCut()")
	public void throwing(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() + "----throwing");

	}
}
