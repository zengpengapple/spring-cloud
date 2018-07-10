/**
 * Project Name:product-server
 * File Name:ProductController.java
 * Package Name:org.example.product.controller
 * Date:2018年7月6日下午8:00:52
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.example.common.util.JsonResultUtil;
import org.example.common.vo.JsonResult;
import org.example.order.common.vo.CartVo;
import org.example.product.common.vo.ProductCategoryVo;
import org.example.product.common.vo.ProductInfoVo;
import org.example.product.entity.ProductCategory;
import org.example.product.entity.ProductInfo;
import org.example.product.service.ProductCategoryService;
import org.example.product.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductInfoService  productInfoService;
	
	
	@Autowired
	private  ProductCategoryService productCategoryService;
	


	
	
	@PostMapping("/list")
	public JsonResult<List<ProductCategoryVo>>  getAllUp() throws InterruptedException {
		List<ProductInfo> ProductInfos = productInfoService.findAllUp();
		List<Integer> categoryTypes = ProductInfos.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
		List<ProductCategory> productCategorys = productCategoryService.findByCategoryTypeIn(categoryTypes);
		List<ProductCategoryVo>  productCategoryVos  = new ArrayList<>();
		ProductCategoryVo  productCategoryVo  =  null;
		ProductInfoVo  productInfoVo  = null;
		for (ProductCategory category : productCategorys) {
			productCategoryVo  = new ProductCategoryVo();
			BeanUtils.copyProperties(category, productCategoryVo);
			for (ProductInfo product : ProductInfos) {
				if(category.getCategoryType()  ==   product.getCategoryType()) {
					productInfoVo  =  new ProductInfoVo();
					BeanUtils.copyProperties(product, productInfoVo);
					productCategoryVo.getFoods().add(productInfoVo);
				}
			}
			productCategoryVos.add(productCategoryVo);
		}
		return JsonResultUtil.ok(productCategoryVos);
	}
	
	@PostMapping("findByIds")
	public List<ProductInfoVo> findByIds(@RequestBody List<String> ids){
		List<ProductInfoVo> list = productInfoService.findByProductIdIn(ids);
		return  list;
	}
	
	
	@PostMapping("decreaseStock")
	public void decreaseStock(@RequestBody List<CartVo> cartVos){
		  productInfoService.decreaseStock(cartVos);
	}
	
	
}

