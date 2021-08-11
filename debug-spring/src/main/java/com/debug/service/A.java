package com.debug.service;


import com.debug.entity.Blue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Component
public class A {

	@Autowired
	private B b;


	public void m(){
		System.out.println("a中的m");
//		b.m();
	}


	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
