package com.hy.hotel.service;

import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.UserComment;
import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;

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
}
