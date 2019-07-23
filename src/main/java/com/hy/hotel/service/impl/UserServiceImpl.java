package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.FoodMapper;
import com.hy.hotel.mapper.TravelStoryMapper;
import com.hy.hotel.mapper.UserMapper;
import com.hy.hotel.pojo.*;
import com.hy.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    FoodMapper foodMapper;
    @Autowired
    TravelStoryMapper travelStoryMapper;

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
        if (result > 0) {
            message = "修改密码成功";
        } else {
            message = "修改密码失败";
        }
        return new DataResult<>(result, message, userLogin1);
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
        int result = userMapper.inserPersonal(userInfo);
        System.out.println(result);
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
        return new DataResult<>(result, message, userLogin);
    }

    @Override
    public List<UserComment> selectCommentAll() {
        return userMapper.selectCommentAll();
    }

    @Override
    public DataResult userFoodSc(int userId, int foodId) {
        UserSc userSc = new UserSc();
        userSc.setFoodId(foodId);
        userSc.setUserId(userId);
        int result = userMapper.userFoodSc(userSc);
        String message = null;
        if (result > 0) {
            message = "收藏成功";
        } else {
            message = "收藏失败";
        }
        return new DataResult<>(result, message);
    }

    @Override
    public UserSc selectUserSc(int userId) {
        List<Integer> foodIdList = userMapper.selectUserFoodSc(userId);
        List<Integer> traverstoryLis = userMapper.selectUserTravelstorySc(userId);
        List<Food> foodList = new ArrayList<>();
        List<Travelstory> travelstoryList = new ArrayList<>();
        UserSc userSc = new UserSc();
        for (int id : foodIdList) {
            Food food = foodMapper.selectFoodById(id);
            foodList.add(food);
        }
        for (int id : traverstoryLis) {
            Travelstory travelstory = travelStoryMapper.travelStoryId(id);
            travelstoryList.add(travelstory);
        }
        userSc.setFoodList(foodList);
        userSc.setTravelstoryList(travelstoryList);
        return userSc;
    }

    @Override
    public DataResult userTraverStorySc(int userId, int travelstoryId) {
        UserSc userSc = new UserSc();
        userSc.setTravelstoryId(travelstoryId);
        userSc.setUserId(userId);
        int result = userMapper.userTravestorySc(userSc);
        String message = null;
        if (result > 0) {
            message = "收藏成功";
        } else {
            message = "收藏失败";
        }
        return new DataResult<>(result, message);
    }

    @Override
    public DataResult insertUserAddress(UserAddress userAddress) {
        //插入数据
        int result = userMapper.insertUserAddress(userAddress);
        UserAddress userAddress1 = userMapper.selectUserAddressById(userAddress.getId());
        String message = null;
        if (result > 0) {
            message = "添加成功";
        } else {
            message = "添加失败";
        }
        //查询数据
        return new DataResult<>(result,message,userAddress1);
    }

}
