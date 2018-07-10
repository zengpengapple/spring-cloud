/**
 * Project Name:product-common
 * File Name:ProductInfoStatusEnum.java
 * Package Name:org.example.product.common.emuns
 * Date:2018年7月6日下午4:29:47
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.common.enums;

import lombok.Getter;

/**
 * 
 * @ClassName:  ProductInfoStatusEnum   
 * @Description:产品状态
 * @author: zengpeng 
 * @date:   2018年7月6日 下午4:29:59
 */

@Getter
public enum ProductInfoStatusEnum {
	
	DOWN(0,"下架"),
	UP(1,"上架"),
	NOT_EXISTS(2,"产品不存在"),
	STOCK_NOT_ENOUGH(3,"库存不够");
	
	private Integer code;
	private String  value;
	
	private ProductInfoStatusEnum(Integer code,String value) {
		this.code = code ;
		this.value = value;
	}

}

