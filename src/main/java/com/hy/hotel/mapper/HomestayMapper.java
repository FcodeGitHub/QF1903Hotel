package com.hy.hotel.mapper;

import com.hy.hotel.pojo.Homestay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomestayMapper {
    /**
     * 查询所有
     */
    List<Homestay> selectHomestayAll();
}
