package com.mlby.dao;

import com.mlby.pojo.Joinus;

public interface JoinusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Joinus record);

    int insertSelective(Joinus record);

    Joinus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joinus record);

    int updateByPrimaryKey(Joinus record);
}