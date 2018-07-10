/**
 * Project Name:order-server
 * File Name:OrderController.java
 * Package Name:org.example.order.controller
 * Date:2018年7月7日下午3:53:20
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.controller;

import org.example.order.common.vo.OrderVo;
import org.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/createOrder")
	public String createOrder(@RequestBody OrderVo  orderVo) {
		return orderService.createOrder(orderVo);
	}
}

