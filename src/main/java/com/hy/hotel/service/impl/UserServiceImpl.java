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

        int result = userMapper.login(userLogin);
        return result > 0 ? true:false;
    }

    @Override
    public boolean register(UserLogin userLogin) {
        int result = userMapper.register(userLogin);
        return result > 0 ? true:false;
    }
}
