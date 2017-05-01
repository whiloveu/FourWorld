package com.wh.lib.controller;

/**
 * @author mochizuo
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.lib.domain.CustomerInfo;
import com.wh.lib.service.CustomerService;
import com.wh.lib.util.BaseResp;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Resource
	private CustomerService customerService;
	
	@ResponseBody
	@RequestMapping("/login")
	public BaseResp<CustomerInfo> cusLogin(HttpServletRequest request, HttpServletResponse responce){
		
		BaseResp<CustomerInfo> baseResp = new BaseResp<CustomerInfo>();
		
		String cusName = request.getParameter("username");
		String cuspass = request.getParameter("userpass");
		CustomerInfo customerInfo2 = this.customerService.selectCustomerByid(2017050112);
		CustomerInfo customerInfo = this.customerService.selectCustomerByName(cusName);
		
		if(cuspass.equals(customerInfo.getCuspassword())){
			baseResp.setReturnMag("登录成功");
		}
		
		
		
		return baseResp;
	}
	@ResponseBody
	@RequestMapping("/regist")
	public BaseResp<CustomerInfo> cusRegist(HttpServletRequest request, HttpServletRequest responce){
		BaseResp<CustomerInfo> baseResp = new BaseResp<CustomerInfo>();
		
		String username = request.getParameter("name");
		String userpass = request.getParameter("userpass");
		
		
	    String question1 = request.getParameter("question1");
	    String answer1 = request.getParameter("answer1");
	    String question2 = request.getParameter("question2");
	    String answer2 = request.getParameter("answer2");
	    CustomerInfo customerInfo = new CustomerInfo();
	    customerInfo.setCusname(username);
	    customerInfo.setCuspassword(userpass);
	    customerInfo.setQuestion1(question1);
	    customerInfo.setQuestion2(question2);
	    customerInfo.setAnswer1(answer1);
	    customerInfo.setAnswer2(answer2);
	    
	    customerService.addCustomer(customerInfo);
	    baseResp.setReturnMag("用户 "+username+" 注册成功！");
		
		return baseResp;
	}

}
