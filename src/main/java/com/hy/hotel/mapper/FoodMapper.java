package com.hy.hotel.mapper;

import com.hy.hotel.pojo.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {
    /**
     * 查询所有
     */
    List<Food> selectFoodALl();

    /**
     * 通过id查询
     */
    Food selectFoodById(int id);
}
