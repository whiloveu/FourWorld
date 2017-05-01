package com.wh.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.lib.Impl.CustomerImpl;
import com.wh.lib.dao.CustomerInfoMapper;
import com.wh.lib.domain.CustomerInfo;

@Service("CustomerService")
public class CustomerService implements CustomerImpl{
	
	@Autowired
	private CustomerInfoMapper customerInfoMapper;

	@Override
	public  void addCustomer(CustomerInfo cudtmerinfo) {
		customerInfoMapper.insert(cudtmerinfo);
		
	}

	@Override
	public CustomerInfo selectCustomerByName(String name) {
		return customerInfoMapper.selectByName(name);
	}

	@Override
	public CustomerInfo selectCustomerByid(int id) {
		// TODO Auto-generated method stub
		return customerInfoMapper.selectByPrimaryKey(id);
	}
	

}
