/**
 * Project Name:product-server
 * File Name:ProductInfoRepository.java
 * Package Name:org.example.product.repository
 * Date:2018年7月6日下午3:51:34
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.repository;

import java.util.List;

import org.example.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

	List<ProductInfo> findByProductStatus(Integer status);
	
	List<ProductInfo> findByProductIdIn(List<String> ids);
}

