package com.wh.lib.dao;

import com.wh.lib.domain.TransctionRecord;

public interface TransctionRecordMapper {
    int deleteByPrimaryKey(String recordid);

    int insert(TransctionRecord record);

    int insertSelective(TransctionRecord record);

    TransctionRecord selectByPrimaryKey(String recordid);

    int updateByPrimaryKeySelective(TransctionRecord record);

    int updateByPrimaryKey(TransctionRecord record);
}