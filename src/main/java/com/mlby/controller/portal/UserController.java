package com.mlby.controller.portal;

import com.mlby.common.Const;
import com.mlby.common.ServerResponse;
import com.mlby.pojo.User;
import com.mlby.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @description: TODO
 * @author: dhc
 * @Date: 2020-03-24 22:25
 * @version: 1.0
 * 用户
 */

@Controller
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
        ServerResponse<User>response=iUserService.login(username,password);
       //是成功的
        if (response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return  response;

    }


}
