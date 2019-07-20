package com.hy.hotel.service;

import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;

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

}
