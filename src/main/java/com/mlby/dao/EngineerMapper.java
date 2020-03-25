package com.mlby.dao;

import com.mlby.pojo.Engineer;

public interface EngineerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Engineer record);

    int insertSelective(Engineer record);

    Engineer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Engineer record);

    int updateByPrimaryKey(Engineer record);
}