/**
 * Project Name:order-server
 * File Name:OrderServiceImpl.java
 * Package Name:org.example.order.service.impl
 * Date:2018年7月7日下午2:12:41
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.example.order.common.vo.CartVo;
import org.example.order.common.vo.OrderVo;
import org.example.order.entity.OrderDetail;
import org.example.order.entity.OrderMaster;
import org.example.order.repository.OrderDetailRepository;
import org.example.order.repository.OrderMasterRepository;
import org.example.order.service.OrderService;
import org.example.product.client.ProductClient;
import org.example.product.common.vo.ProductInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	
    @Autowired
    private ProductClient  productClient;
    
    
    @Autowired
    private OrderDetailRepository  orderDetailRepository;
    
    
    @Autowired
    private OrderMasterRepository  orderMasterRepository;
	
	@Override
	public String createOrder(OrderVo orderVo) {
		//查询产品
		List<String> ids = orderVo
		.getItems()
		.stream()
		.map(CartVo::getProductId)
		.collect(Collectors.toList());
		List<ProductInfoVo> productInfoVos = productClient.findByIds(ids);
		if(productInfoVos == null ||  productInfoVos.isEmpty()) {
			return null;
		}
		//计算总价
		BigDecimal  orderAmout =  BigDecimal.ZERO;
		
		String orderId  = UUID.randomUUID().toString();
		OrderDetail orderDetail  = null;
		
		for (CartVo cartVo : orderVo.getItems()) {
			for (ProductInfoVo productInfoVo : productInfoVos) {
				if(cartVo.getProductId().equals(productInfoVo.getProductId())) {
					//单价*数量
					orderAmout  =  productInfoVo.getProductPrice()
							       .multiply(new BigDecimal(cartVo.getProductQuantity()))
							       .add(orderAmout);
					//插入订单详情
					orderDetail = new OrderDetail();
					BeanUtils.copyProperties(productInfoVo, orderDetail);
					orderDetail.setOrderId(orderId);
					orderDetail.setDetailId(UUID.randomUUID().toString());
					orderDetail.setProductQuantity(cartVo.getProductQuantity());
					orderDetailRepository.save(orderDetail);
				}
			}
		}
		
		//扣减库存
		productClient.decreaseStock(orderVo.getItems());
		
		//生成订单
		OrderMaster orderMaster  = new OrderMaster();
		BeanUtils.copyProperties(orderVo, orderMaster);
		orderMaster.setOrderAmount(orderAmout);
		orderMaster.setOrderId(orderId);

	
		return orderMasterRepository.save(orderMaster).getOrderId();
	}

}

