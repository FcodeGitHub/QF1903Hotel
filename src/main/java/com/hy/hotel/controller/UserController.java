package com.hy.hotel.controller;

import com.hy.hotel.pojo.UserLogin;
import com.hy.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login (UserLogin userLogin) {
        // 登录
        boolean result = userService.login(userLogin);
        // 验证登录是否正确跳转页面
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 注册
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(UserLogin userLogin) {
        boolean result = userService.insertUser(userLogin);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 修改密码
     */
    @RequestMapping("updatePassword")
    @ResponseBody
    public String updatePassword(UserLogin userLogin) {
        boolean result = userService.updatePassword(userLogin);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }
}
