package com.hy.hotel.service;

import com.hy.hotel.pojo.*;

import java.util.List;

public interface UserService {

    /**
     * 登录
     */
    DataResult login(UserLogin userLogin);

    /**
     * 修改密码
     */
    DataResult updatePassword(UserLogin userLogin);

    /**
     * 注册
     */
    DataResult insertUser(UserLogin userLogin);


    /**
     * 个人页面展示
     */
    DataResult PersonalCentre(UserInfo userInfo);

    /**
     * 验证手机是否存在
     */
    DataResult isExist(String phone);

    /**
     * 用户评论
     */
    List<UserComment> selectCommentAll();

    /**
     * 用户美食收藏
     */
    DataResult userFoodSc(int userId, int foodId);

    /**
     * 查询用户收藏
     */
    UserSc selectUserSc(int userId);

    /**
     * 用户旅行攻略收藏
     */
    DataResult userTraverStorySc(int userId, int travelstoryId);

    /**
     * 添加用户地址
     */
    DataResult insertUserAddress(UserAddress userAddress);
}
