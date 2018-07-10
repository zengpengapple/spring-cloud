/**
 * Project Name:order-server
 * File Name:OrderService.java
 * Package Name:org.example.order.service
 * Date:2018年7月7日下午2:11:59
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.service;

import org.example.order.common.vo.OrderVo;

public interface OrderService {

	/**
	 * 
	 * @Title: createOrder   
	 * @Description: 创建订单,返回订单号
	 * @author zengpeng   
	 * @param: @param orderVo
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	String createOrder(OrderVo orderVo);
}

