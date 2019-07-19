package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.UserMapper;
import com.hy.hotel.pojo.DataResult;
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
        if (result > 0) {
            return new DataResult(result,"登陆成功",userLogin1);
        } else {
            return new DataResult(result,"登陆失败");
        }
    }

    @Override
    public boolean updatePassword(UserLogin userLogin) {
        return userMapper.updatePassword(userLogin) > 0 ? true : false;
    }

    @Override
    public boolean insertUser(UserLogin userLogin) {
        return userMapper.insertUser(userLogin) > 0 ? true : false;
    }
}
