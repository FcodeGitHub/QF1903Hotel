package com.hy.hotel.service;

import com.hy.hotel.pojo.Homestay;
import com.hy.hotel.pojo.HotelBed;

import java.util.List;

public interface HomestayService {
    /**
     * 查询所有
     */
    List<Homestay> selectHomestayAll();

    //通过酒店ID查询酒店的房间类型
    List<HotelBed> selectHotelBedId(int id);
}
