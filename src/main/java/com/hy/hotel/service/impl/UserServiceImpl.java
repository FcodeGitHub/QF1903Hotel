package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.UserMapper;
import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;
import com.hy.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public DataResult login(UserLogin userLogin) {
        int result = userMapper.login(userLogin);
        UserLogin userLogin1 = userMapper.selectUserByAccount(userLogin.getAccount());
        String message = null;
        if (result > 0) {
            message = "登录成功";
        } else {
            message = "登录失败";
        }
        return new DataResult(result, message, userLogin1);
    }

    @Override
    public boolean updatePassword(UserLogin userLogin) {
        return userMapper.updatePassword(userLogin) > 0 ? true : false;
    }

    @Override
    public DataResult insertUser(UserLogin userLogin) {
        int result = userMapper.insertUser(userLogin);
        UserLogin userLogin1 = userMapper.selectUserByAccount(userLogin.getAccount());
        String message = null;
        if (result > 0) {
            message = "注册成功";
        } else {
            message = "注册失败";
        }
        return new DataResult(result, message, userLogin1);
    }

    //个人详情页
    @Override
    public boolean PersonalCentre(UserInfo userInfo) {

        int result = userMapper.inserPersonal(userInfo);
        if (result>0) {
            return true;
        }else{
            return false;
        }
    }


}
