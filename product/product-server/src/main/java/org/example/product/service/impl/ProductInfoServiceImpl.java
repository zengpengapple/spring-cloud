/**
 * Project Name:product-server
 * File Name:ProductInfoServiceImpl.java
 * Package Name:org.example.product.service.impl
 * Date:2018年7月6日下午7:34:42
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.example.order.common.vo.CartVo;
import org.example.product.common.enums.ProductInfoStatusEnum;
import org.example.product.common.exception.ProductException;
import org.example.product.common.vo.ProductInfoVo;
import org.example.product.entity.ProductInfo;
import org.example.product.repository.ProductInfoRepository;
import org.example.product.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
	
	@Autowired
	private  ProductInfoRepository  productInfoRepository;

	@Override
	public List<ProductInfo> findAllUp() {
		return productInfoRepository.findByProductStatus(ProductInfoStatusEnum.UP.getCode());
	}

	@Override
	public List<ProductInfoVo> findByProductIdIn(List<String> ids) {
		return productInfoRepository
				.findByProductIdIn(ids)
				.stream()
				.map(e->{
					ProductInfoVo productInfoVo  = new ProductInfoVo();
					BeanUtils.copyProperties(e, productInfoVo);
					return productInfoVo;
				 
				}).collect(Collectors.toList());
	}

	@Override
	@Transactional
	public void decreaseStock(List<CartVo> cartVos) {
		if(cartVos == null) {
			return;
		}
		
		for (CartVo cartVo : cartVos) {
			Optional<ProductInfo> optional = productInfoRepository.findById(cartVo.getProductId());
			if(!optional.isPresent()) {
				//产品不存在
				throw new ProductException(ProductInfoStatusEnum.NOT_EXISTS);
			}
			ProductInfo productInfo  = optional.get();
			
			Integer updateStock =  productInfo.getProductStock()-cartVo.getProductQuantity();
			if(updateStock<0) {
				//库存不够
				throw new ProductException(ProductInfoStatusEnum.STOCK_NOT_ENOUGH);
			}
			
			//更新库存
			productInfo.setProductStock(updateStock);
			productInfoRepository.save(productInfo);
		}
	   
		
	}

}

