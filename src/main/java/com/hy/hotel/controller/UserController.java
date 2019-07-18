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

    @RequestMapping("/login")
    @ResponseBody
    public String login(UserLogin userLogin){

        boolean result = userService.login(userLogin);
        if (result){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(UserLogin userLogin){


        boolean result = userService.register(userLogin);
        if (result){
            return "success";
        }else {
            return "false";
        }
    }
}
