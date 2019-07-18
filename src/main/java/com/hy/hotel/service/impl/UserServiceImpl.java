package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.UserMapper;
import com.hy.hotel.pojo.UserLogin;
import com.hy.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(UserLogin userLogin) {
        return userMapper.login(userLogin) > 0 ? true : false;
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
