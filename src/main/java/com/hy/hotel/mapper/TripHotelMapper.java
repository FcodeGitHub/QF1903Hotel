package com.hy.hotel.mapper;

import com.hy.hotel.pojo.TripHotel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TripHotelMapper {
    /**
     * 出行酒店查询
     */
    List<TripHotel> selectTripHotelAll();
}
