package com.hy.hotel.service;

import com.hy.hotel.pojo.TripHotel;

import java.util.List;

public interface TripHotelService {
    /**
     * 出行酒店查询
     */
    List<TripHotel> selectTripHotelAll();
}
