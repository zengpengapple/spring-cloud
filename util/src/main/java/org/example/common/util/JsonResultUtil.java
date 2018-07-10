/**
 * Project Name:util
 * File Name:JsonResultUtil.java
 * Package Name:org.example.common.util
 * Date:2018年7月7日上午9:32:02
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package org.example.common.util;

import org.example.common.enums.ProcessStatusEnums;
import org.example.common.vo.JsonResult;

/**
 * 
 * @ClassName:  JsonResultUtil   
 * @Description:JsonResult工具类 
 * @author: zengpeng 
 * @date:   2018年7月7日 上午9:40:32
 */
public class JsonResultUtil {

	
	public static <T> JsonResult<T> ok(T data){
		return  new  JsonResult<T>(ProcessStatusEnums.OK.getCode(), ProcessStatusEnums.OK.getMsg(), data);
	}
	
	
	public static <T> JsonResult<T> error(T data){
		return  new  JsonResult<T>(ProcessStatusEnums.ERROR.getCode(), ProcessStatusEnums.ERROR.getMsg(), data);
	}
	
	public static <T> JsonResult<T> error (){
		return  error(null);
	}
}

