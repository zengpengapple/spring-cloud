/**
 * Project Name:product-common
 * File Name:ProductInfoVo.java
 * Package Name:org.example.product.common.vo
 * Date:2018年7月7日上午10:17:13
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.common.vo;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ProductInfoVo {
    
	

	private String productId;


	private int categoryType;


	private Date createTime;


	private String productDescription;


	private String productIcon;

	private String productName;


	private BigDecimal productPrice;

	private Integer productStatus;


	private Integer productStock;

	private Date updateTime;
}

