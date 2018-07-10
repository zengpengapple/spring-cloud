/**
 * Project Name:order-server
 * File Name:OrderMasterRepository.java
 * Package Name:org.example.order.repository
 * Date:2018年7月7日下午1:38:57
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.order.repository;

import org.example.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}

