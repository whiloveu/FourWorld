package com.wh.lib.Impl;

import com.wh.lib.domain.Address;

public interface AddressImpl {
	void addAddress(Address address);
	void updateAddress(Address address);
	Address selectAddressByCustomerId(int id);

}
