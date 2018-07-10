/**
 * Project Name:product-common
 * File Name:ProductException.java
 * Package Name:org.example.product.common.exception
 * Date:2018年7月9日下午2:05:46
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.common.exception;

import org.example.product.common.enums.ProductInfoStatusEnum;

import lombok.Getter;
import lombok.Setter;


public class ProductException extends RuntimeException {

	/**
	 * serialVersionUID:用一句话描述这个变量表示什么.
	 */
	private static final long serialVersionUID = 5135538606660843808L;
	
	@Getter
	@Setter
	private  Integer  code;
	
	public ProductException(Integer code,String msg) {
		super(msg);
		this.code = code;
	}
	
	
	public ProductException(ProductInfoStatusEnum productInfoStatusEnum) {
		this(productInfoStatusEnum.getCode(),productInfoStatusEnum.getValue());
	}
	
}

