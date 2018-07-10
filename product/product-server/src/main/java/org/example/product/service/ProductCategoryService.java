/**
 * Project Name:product-server
 * File Name:ProductCategoryService.java
 * Package Name:org.example.product.service
 * Date:2018年7月7日上午9:56:37
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.service;

import java.util.List;

import org.example.product.entity.ProductCategory;

public interface ProductCategoryService {

	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);
}

