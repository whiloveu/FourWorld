package com.wh.lib.dao;

import com.wh.lib.domain.admin;

public interface adminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(admin record);

    int insertSelective(admin record);

    admin selectByPrimaryKey(Integer id);
    
    admin selectByName(String name);

    int updateByPrimaryKeySelective(admin record);

    int updateByPrimaryKey(admin record);
}