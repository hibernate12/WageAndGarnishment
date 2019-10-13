package com.nit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.nit.service.WageGarnishmentService;

@Component
public class HeaderInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private WageGarnishmentService service;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("******************Inside pre handle*************************************************");
		String company = request.getHeader("company");

		if (company == null) {
			System.out.println("Please Enter Value");
			return false;
		} else if (!service.isCompanyExits(company)) {
			System.out.println("Please Enter valid Company");
			return false;
		}

		return true;

	}

}
