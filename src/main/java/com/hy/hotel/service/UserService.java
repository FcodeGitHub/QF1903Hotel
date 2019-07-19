package com.hy.hotel.service;

import com.hy.hotel.pojo.UserLogin;

public interface UserService {
    /**
     * 登录
     */
    boolean login(UserLogin userLogin);

    /**
     * 修改密码
     */
    boolean updatePassword(UserLogin userLogin);

    /**
     * 注册
     */
    boolean insertUser(UserLogin userLogin);
}
