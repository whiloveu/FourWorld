package com.wh.lib.dao;

import com.wh.lib.domain.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addressid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addressid);
    Address selectByCustomerId(Integer customerid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}