package com.mlby.controller.backend;

import com.mlby.common.ServerResponse;
import com.mlby.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @description: TODO
 * @author: dhc
 * @Date: 2020-03-24 21:43
 * @version: 1.0
 */

@Controller
@RequestMapping("/api/manage/user")
public class UserManageController {
    /**
     * 管理员登录
     * @param username
     * @param password
     * @param session
     * @return
     */
 public ServerResponse<User>login(String username, String password, HttpSession session){
return null;
   }

}
