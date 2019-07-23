package com.hy.hotel.mapper;

import com.hy.hotel.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
    UserInfo selectPersonal(int id);

    /**
     * 验证手机是否存在
     */
    int isExist(String phone);

    /**
     * 用户评论
     */
    List<UserComment> selectCommentAll();

    /**
     * 用户美食收藏
     */
    int userFoodSc(UserSc userSc);

    /**
     *查询收藏
     */
    List<Integer> selectUserFoodSc(int userId);

    /**
     * 用户攻略收藏
     */
    int userTravestorySc(UserSc userSc);

    /**
     * 查询收藏
     */
    List<Integer> selectUserTravelstorySc(int userId);

    /**
     * 新增地址
     */
    int insertUserAddress(UserAddress userAddress);

    /**
     * 通过id查询数据
     */
    UserAddress selectUserAddressById(Integer id);


}
