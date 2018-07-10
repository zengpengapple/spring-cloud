/**
 * Project Name:util
 * File Name:ProcessStatusEnums.java
 * Package Name:org.example.common.enums
 * Date:2018年7月7日上午9:33:51
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.common.enums;

import lombok.Getter;

/**
 * 
 * @ClassName:  ProcessStatusEnums   
 * @Description:处理状态   
 * @author: zengpeng 
 * @date:   2018年7月7日 上午9:33:55
 */
@Getter
public enum ProcessStatusEnums {
	
	
	OK(200,"操作成功"),
	ERROR(500,"操作失败");
    
	/**
	 * 状态码
	 */
	private  Integer code;
	/**
	 * 消息
	 */
	private String msg;
	
	
	private ProcessStatusEnums(Integer code ,String msg) {
		this.code = code;
		this.msg = msg;
	}
}

