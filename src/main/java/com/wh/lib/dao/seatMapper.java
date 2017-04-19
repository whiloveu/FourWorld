package com.wh.lib.dao;

import com.wh.lib.domain.seat;

public interface seatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(seat record);

    int insertSelective(seat record);

    seat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(seat record);

    int updateByPrimaryKey(seat record);
}