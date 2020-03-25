package com.mlby.service.impl;

import com.mlby.common.ServerResponse;
import com.mlby.dao.UserMapper;
import com.mlby.pojo.User;
import com.mlby.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: dhc
 * @Date: 2020-03-24 21:54
 * @version: 1.0
 * 用户接口实现
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
   @Override
    public ServerResponse<User> login(String username, String password){
        int resultCount=userMapper.checkUsername(username);
        if (resultCount==0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
//String md5Password=MD5Util.MD5EncodeUtf8(password);
        User user=userMapper.userLogin(username,password);
        if (user==null){
            return  ServerResponse.createByErrorMessage("密码错误");
        }
        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
