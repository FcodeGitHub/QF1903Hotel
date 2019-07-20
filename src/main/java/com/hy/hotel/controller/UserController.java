package com.hy.hotel.controller;

import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;
import com.hy.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public DataResult login (UserLogin userLogin, HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 登录
        // 验证登录是否正确跳转页面
        return userService.login(userLogin);
    }

    /**
     * 注册
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public DataResult insertUser(UserLogin userLogin,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        return userService.insertUser(userLogin);
    }

    /**
     * 修改密码
     */
    @RequestMapping("updatePassword")
    @ResponseBody
    public String updatePassword(UserLogin userLogin,HttpServletResponse response) {

        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        boolean result = userService.updatePassword(userLogin);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }


    /**
     * 个人页面展示
     * @return
     */
    @RequestMapping("/PersonalCentre")
    @ResponseBody
    public String PersonalCentre(UserInfo userInfo, HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        boolean result = userService.PersonalCentre(userInfo);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

}
