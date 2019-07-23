package com.hy.hotel.controller;

import com.hy.hotel.pojo.*;
import com.hy.hotel.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.javascript.navig.LinkArray;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    @ApiOperation(value="个人中心展示")
    public DataResult PersonalCentre(UserInfo userInfo, HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.PersonalCentre(userInfo);
    }

    /**
     * 验证手机是否存在
     */
    @RequestMapping("/isExist")
    public DataResult isExist(String phone,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.isExist(phone);
    }

    /**
     * 用户评论
     */
    @RequestMapping("/selectCommentAll")
    public List<UserComment> selectCommentAll(HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.selectCommentAll();
    }

    /**
     * 用户美食收藏
     */
    @RequestMapping("/userFoodSc")
    public DataResult userFoodSc(int userId,int foodId,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.userFoodSc(userId,foodId);
    }

    /**
     * 用户旅行攻略收藏
     */
    @RequestMapping("/userTraverStorySc")
    public DataResult userTraverStorySc(int userId,int travelstoryId,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.userTraverStorySc(userId,travelstoryId);
    }

    /**
     * 查询用户收藏
     */
    @RequestMapping("/selectUserSc")
    public UserSc selectUserSc(int userId,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.selectUserSc(userId);
    }

    /**
     * 添加用户地址
     */
    @RequestMapping("insertUserAddress")
    public DataResult insertUserAddress(UserAddress userAddress,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userService.insertUserAddress(userAddress);
    }
}
