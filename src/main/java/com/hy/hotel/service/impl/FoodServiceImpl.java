package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.FoodMapper;
import com.hy.hotel.pojo.Food;
import com.hy.hotel.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodMapper foodMapper;

    @Override
    public List<Food> selectFoodALl() {

        List<Food> foodList = foodMapper.selectFoodALl();

        return foodList;
    }

    @Override
    public Food selectFoodById(int id) {
        Food food = foodMapper.selectFoodById(id);
        System.out.println(food.getFoodExperienceId());
        food.setFoodExperience(foodMapper.selectFoodExperience(food.getFoodExperienceId()));
        return food;
    }

}
