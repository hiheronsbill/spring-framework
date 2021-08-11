package com.debug.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class B {

	@Autowired
	private A a;


	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

    public void m() {
		System.out.println("b中的m");
		a.m();
    }
}
