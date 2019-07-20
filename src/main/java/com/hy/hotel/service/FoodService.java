package com.hy.hotel.service;

import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.Food;

public interface FoodService {
    /**
     * 查询所有
     */
    DataResult selectFoodALl();

    /**
     * 通过id查询
     */
    Food selectFoodById(int id);
}
