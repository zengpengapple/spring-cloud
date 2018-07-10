/**
 * Project Name:order-common
 * File Name:CartVo.java
 * Package Name:org.example.order.common.vo
 * Date:2018年7月7日下午1:53:18
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.common.vo;

import lombok.Data;

/**
 * 
 * @ClassName:  CartVo   
 * @Description:购物车  
 * @author: zengpeng 
 * @date:   2018年7月7日 下午1:53:23
 */
@Data
public class CartVo {

	/**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartVo() {
    }

    public CartVo(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}

