package com.wh.lib.dao;

import com.wh.lib.domain.ProductInfo;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(String productid);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productid);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
}