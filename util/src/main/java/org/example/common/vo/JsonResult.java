/**
 * Project Name:util
 * File Name:JsonResult.java
 * Package Name:org.example.util.vo
 * Date:2018年7月6日下午8:16:55
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.common.vo;

import lombok.Data;

/**
 * 
 * @ClassName:  JsonResult   
 * @Description:json返回数据
 * @author: zengpeng 
 * @date:   2018年7月6日 下午8:18:15
 * @param <T>
 */
@Data
public class JsonResult<T> {
	/**
	 * 状态码
	 */
	private Integer code;
	/**
	 * 消息
	 */
	private String msg;
	/**
	 * 数据
	 */
	private T  data;
	
	
	public JsonResult(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}


	public JsonResult() {
		super();
	}
	
	
	
	

}

