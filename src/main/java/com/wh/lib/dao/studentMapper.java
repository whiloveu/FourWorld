package com.wh.lib.dao;

import com.wh.lib.domain.student;

public interface studentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}