package com.wh.lib.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wh.lib.domain.Address;
import com.wh.lib.service.AddressService;
import com.wh.lib.util.BaseResp;

/**
 * 
 * @author mochizuo
 *
 */
@Controller
@RequestMapping("/address")
public class AddressController {
	@Resource
	private AddressService addressService;
	
	/**
	 * 添加地址
	 * @param request
	 * @param response
	 * @return
	 */
	public BaseResp<Address> addAddress(HttpServletRequest request, HttpServletResponse response){
		BaseResp<Address> baseResp = new BaseResp<Address>();
		
		
		
		
		return baseResp;
	}
	

}
