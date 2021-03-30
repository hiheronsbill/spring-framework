package com.debug.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhxy
 * @date 2021/3/30 - 10:46 下午
 */

@Component
public class OrderService {

	@Autowired
	private UserService userService;

	public void test(){}

}
