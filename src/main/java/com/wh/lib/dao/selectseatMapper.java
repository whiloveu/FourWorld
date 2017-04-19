package com.wh.lib.dao;

import com.wh.lib.domain.selectseat;

public interface selectseatMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(selectseat record);

    int insertSelective(selectseat record);

    selectseat selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(selectseat record);

    int updateByPrimaryKey(selectseat record);
}