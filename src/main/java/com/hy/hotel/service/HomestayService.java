package com.hy.hotel.service;

import com.hy.hotel.pojo.Homestay;

import java.util.List;

public interface HomestayService {
    /**
     * 查询所有
     */
    List<Homestay> selectHomestayAll();
}
