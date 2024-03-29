package com.hy.hotel.mapper;

import com.hy.hotel.pojo.Homestay;
import com.hy.hotel.pojo.HotelBed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomestayMapper {
    /**
     * 查询所有
     */
    List<Homestay> selectHomestayAll();

    List<HotelBed> selectHotelBedId(int id);
}
