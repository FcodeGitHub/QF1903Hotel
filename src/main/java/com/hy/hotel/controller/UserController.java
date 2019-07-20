package com.hy.hotel.controller;

import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;
import com.hy.hotel.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录
     */
    @RequestMapping("/login")
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
    public DataResult insertUser(UserLogin userLogin,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        return userService.insertUser(userLogin);
    }

    /**
     * 修改密码
     */
    @RequestMapping("updatePassword")
    public DataResult updatePassword(UserLogin userLogin,HttpServletResponse response) {

        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        return userService.updatePassword(userLogin);

    }


    /**
     * 个人页面展示
     */
    @RequestMapping("/PersonalCentre")
    @ResponseBody
    @ApiOperation(value="个人中心展示")
    public DataResult PersonalCentre(UserInfo userInfo, HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.PersonalCentre(userInfo);
    }

}
