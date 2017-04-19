package com.wh.lib.dao;

import com.wh.lib.domain.ShopTrolley;

public interface ShopTrolleyMapper {
    int deleteByPrimaryKey(Integer ordernum);

    int insert(ShopTrolley record);

    int insertSelective(ShopTrolley record);

    ShopTrolley selectByPrimaryKey(Integer ordernum);

    int updateByPrimaryKeySelective(ShopTrolley record);

    int updateByPrimaryKey(ShopTrolley record);
}