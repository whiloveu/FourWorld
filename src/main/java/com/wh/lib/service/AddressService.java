package com.wh.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.lib.Impl.AddressImpl;
import com.wh.lib.dao.AddressMapper;
import com.wh.lib.domain.Address;

@Service("CustomerService")
public class AddressService implements AddressImpl{
	
	@Autowired
	private AddressMapper addressMapper;

	@Override
	public void addAddress(Address address) {
		addressMapper.insert(address);
		
	}

	@Override
	public void updateAddress(Address address) {
		addressMapper.updateByPrimaryKey(address);
		
	}

	@Override
	public Address selectAddressByCustomerId(int id) {
		return addressMapper.selectByCustomerId(id);
	}

}
