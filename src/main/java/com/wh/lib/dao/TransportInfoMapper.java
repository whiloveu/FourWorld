package com.wh.lib.dao;

import com.wh.lib.domain.TransportInfo;

public interface TransportInfoMapper {
    int deleteByPrimaryKey(String transportid);

    int insert(TransportInfo record);

    int insertSelective(TransportInfo record);

    TransportInfo selectByPrimaryKey(String transportid);

    int updateByPrimaryKeySelective(TransportInfo record);

    int updateByPrimaryKey(TransportInfo record);
}