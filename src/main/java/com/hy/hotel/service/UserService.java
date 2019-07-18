package com.hy.hotel.service;

import com.hy.hotel.pojo.UserLogin;

public interface UserService {
    boolean login(UserLogin userLogin);

    boolean register(UserLogin userLogin);
}
