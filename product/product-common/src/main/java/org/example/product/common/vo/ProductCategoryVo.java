/**
 * Project Name:product-common
 * File Name:ProductInfoVo.java
 * Package Name:org.example.product.common.vo
 * Date:2018年7月7日上午10:15:37
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.product.common.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductCategoryVo {

	
	@JsonProperty("name")
	private String categoryName;

    @JsonProperty("type")
	private int categoryType;
    
    
    private List<ProductInfoVo> foods =  new ArrayList<>();
	
}

