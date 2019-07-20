package com.hy.hotel.mapper;

import com.hy.hotel.pojo.UserInfo;
import com.hy.hotel.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 登录
     */
    int login(UserLogin userLogin);

    /**
     * 修改密码
     */
    int updatePassword(UserLogin userLogin);

    /**
     * 注册
     */
    int insertUser(UserLogin userLogin);

    /**
     * 通过用户名查询
     */
    UserLogin selectUserByAccount(String account);

    /**
     * 通过手机号查询
     */
    UserLogin selectUserByPhone(String phone);

    /**
     * 个人页面数据插入
     */
    int inserPersonal(UserInfo userInfo);
    /**
     * 个人页面数据查询
     */
    UserInfo selectPersonal(String adress);

}
