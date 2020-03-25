package com.mlby.dao;

import com.mlby.pojo.UserAuths;

public interface UserAuthsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    UserAuths selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);
}