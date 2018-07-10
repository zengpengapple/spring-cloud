/**
 * Project Name:order-common
 * File Name:OrderVo.java
 * Package Name:org.example.order.common.vo
 * Date:2018年7月7日下午1:52:34
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.common.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 
 * @ClassName:  OrderVo   
 * @Description:订单  
 * @author: zengpeng 
 * @date:   2018年7月7日 下午1:54:32
 */
@Data
public class OrderVo {

	 /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus;
    
    /**购物车****/
    private List<CartVo> items =  new ArrayList<>();

}

