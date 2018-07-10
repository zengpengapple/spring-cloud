/**
 * Project Name:order-server
 * File Name:OrderDetailRepository.java
 * Package Name:org.example.order.repository
 * Date:2018年7月7日上午11:43:10
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.repository;

import org.example.order.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

}

