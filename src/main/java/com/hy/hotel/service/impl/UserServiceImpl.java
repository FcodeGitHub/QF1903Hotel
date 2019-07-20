package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.UserMapper;
import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.UserComment;
import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;
import com.hy.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
        return new DataResult<>(result, message, userLogin1);
    }

    @Override
    public DataResult updatePassword(UserLogin userLogin) {

        int result = userMapper.updatePassword(userLogin);

        UserLogin userLogin1 = userMapper.selectUserByPhone(userLogin.getPhone());
        String message = null;
        if (result > 0){
            message = "修改密码成功";
        }else {
            message = "修改密码失败";
        }
        return new DataResult<>(result,message,userLogin1);
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
        return new DataResult<>(result, message, userLogin1);
    }

    //个人详情页
    @Override
    public DataResult PersonalCentre(UserInfo userInfo) {
        //插入数据
        int result  = userMapper.inserPersonal(userInfo);
        //查询数据
        UserInfo userInfo1 = userMapper.selectPersonal(userInfo.getId());
        String message = null;
        if (result > 0) {
            message = "信息展示";
        } else {
            message = "展示失败";
        }
        return new DataResult<>(result, message, userInfo1);
    }

    @Override
    public DataResult isExist(String phone) {
        int result = userMapper.isExist(phone);
        String message = null;
        UserLogin userLogin = null;
        if (result > 0) {
            message = "手机号正确";
            userLogin = userMapper.selectUserByPhone(phone);
        } else {
            message = "手机号不正确";
        }
        return new DataResult<>(result,message,userLogin);
    }

    @Override
    public List<UserComment> selectCommentAll() {
        return userMapper.selectCommentAll();
    }


}
