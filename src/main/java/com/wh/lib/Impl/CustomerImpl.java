package com.wh.lib.Impl;

import com.wh.lib.domain.CustomerInfo;

public interface CustomerImpl {
	
	void addCustomer(CustomerInfo cudtmerinfo);
	
	CustomerInfo selectCustomerByName(String name);
	CustomerInfo selectCustomerByid(int id);

}
