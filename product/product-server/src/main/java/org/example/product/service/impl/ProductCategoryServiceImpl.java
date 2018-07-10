/**
 * Project Name:product-server
 * File Name:ProductCategoryServiceImpl.java
 * Package Name:org.example.product.service.impl
 * Date:2018年7月7日上午9:57:22
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.service.impl;

import java.util.List;

import org.example.product.entity.ProductCategory;
import org.example.product.repository.ProductCategoryRepository;
import org.example.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) {

		
		return productCategoryRepository.findByCategoryTypeIn(categoryTypes);
	}

}

