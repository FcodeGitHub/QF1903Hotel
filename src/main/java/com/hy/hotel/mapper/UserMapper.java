package com.hy.hotel.mapper;

import com.hy.hotel.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int login(UserLogin userLogin);

    int register(UserLogin userLogin);
}
