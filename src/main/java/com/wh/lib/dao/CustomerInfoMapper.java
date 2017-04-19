package com.wh.lib.dao;

import com.wh.lib.domain.CustomerInfo;

public interface CustomerInfoMapper {
    int deleteByPrimaryKey(Integer customerid);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Integer customerid);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
}