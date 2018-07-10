/**
 * Project Name:product-server
 * File Name:ProductInfoService.java
 * Package Name:org.example.product.service
 * Date:2018年7月6日下午4:23:34
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.service;

import java.util.List;

import org.example.order.common.vo.CartVo;
import org.example.product.common.vo.ProductInfoVo;
import org.example.product.entity.ProductInfo;

public interface ProductInfoService {
    
	/**
	 * 
	 * @Title: findAllUp   
	 * @Description: 查询所有上架产品
	 * @author zengpeng   
	 * @param: @return      
	 * @return: List<ProductInfo>      
	 * @throws
	 */
	List<ProductInfo>  findAllUp();
	
	
	/**
	 * 
	 * @Title: findByProductIdIn   
	 * @Description: 根据多个id查询
	 * @author zengpeng   
	 * @param: @param ids
	 * @param: @return      
	 * @return: List<ProductInfo>      
	 * @throws
	 */
	List<ProductInfoVo> findByProductIdIn(List<String> ids);
	
	
	/**
	 * 
	 * @Title: decreaseStock   
	 * @Description: 扣减库存
	 * @author zengpeng   
	 * @param: @param cartVos      
	 * @return: void      
	 * @throws
	 */
	void decreaseStock(List<CartVo> cartVos);
	
	
	
}

