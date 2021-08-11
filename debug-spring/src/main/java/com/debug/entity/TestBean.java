package com.debug.entity;

/**
 * @author zhxy
 * @Date 2021/5/25 10:46 上午
 */
public class TestBean {

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
