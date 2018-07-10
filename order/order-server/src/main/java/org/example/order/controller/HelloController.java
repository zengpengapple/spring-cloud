/**
 * Project Name:product-server
 * File Name:HelloController.java
 * Package Name:org.example.product.controller
 * Date:2018年7月9日下午3:40:18
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

	
	@Value("${girl.name}")
	private String  name;
	
	
	@GetMapping("/hello")
	public String  hello() {
		return "hello,"+name;
	}
}

