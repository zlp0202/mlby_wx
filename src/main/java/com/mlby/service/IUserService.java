package com.mlby.service;

import com.mlby.common.ServerResponse;
import com.mlby.pojo.User;

/**
 * 用户接口
 */
public interface IUserService {

    //用户登录
    ServerResponse<User> login(String username, String password);

}
