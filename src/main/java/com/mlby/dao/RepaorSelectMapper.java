package com.mlby.dao;

import com.mlby.pojo.RepaorSelect;

public interface RepaorSelectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RepaorSelect record);

    int insertSelective(RepaorSelect record);

    RepaorSelect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RepaorSelect record);

    int updateByPrimaryKey(RepaorSelect record);
}