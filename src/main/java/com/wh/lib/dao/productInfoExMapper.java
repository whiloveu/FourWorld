package com.wh.lib.dao;

import com.wh.lib.domain.productInfoEx;

public interface productInfoExMapper {
    int deleteByPrimaryKey(String productid);

    int insert(productInfoEx record);

    int insertSelective(productInfoEx record);

    productInfoEx selectByPrimaryKey(String productid);

    int updateByPrimaryKeySelective(productInfoEx record);

    int updateByPrimaryKey(productInfoEx record);
}