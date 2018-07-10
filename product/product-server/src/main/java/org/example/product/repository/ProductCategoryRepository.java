/**
 * Project Name:product-server
 * File Name:ProductCategoryRepository.java
 * Package Name:org.example.product.repository
 * Date:2018年7月6日下午3:50:03
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.repository;

import java.util.List;

import org.example.product.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {

	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);
}

