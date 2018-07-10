/**
 * Project Name:api-gateway
 * File Name:LogFilter.java
 * Package Name:com.example.gateway.filter
 * Date:2018年7月10日下午2:05:51
 * Copyright (c) 2018, zengpengapple@qq.com All Rights Reserved.
 *
*/

package com.example.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


/**
 * 
 * @ClassName:  LogFilter   
 * @Description:请求日志过滤器
 * @author: zengpeng 
 * @date:   2018年7月10日 下午2:06:48
 */
@Component
public class LogFilter extends ZuulFilter {
	private static final Logger  logger  = LoggerFactory.getLogger(LogFilter.class);

	@Override
	public boolean shouldFilter() {

	
		return true;
	}

	@Override
	public Object run() throws ZuulException {
       HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
       
       logger.info("请求路径:{},IP:{}",request.getRequestURL(),request.getRemoteHost());
	
		return null;
	}

	@Override
	public String filterType() {

		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {

	
		return FilterConstants.PRE_DECORATION_FILTER_ORDER-1;
	}

}

