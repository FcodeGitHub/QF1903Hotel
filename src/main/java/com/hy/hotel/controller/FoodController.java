package com.hy.hotel.controller;

import com.hy.hotel.pojo.Food;
import com.hy.hotel.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;

    /**
     * 查询所有
     */
    @RequestMapping("/selectFoodALl")
    public List<Food> selectFoodALl(HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return foodService.selectFoodALl();
    }

    /**
     * 通过id查询
     */
    @RequestMapping("/selectFoodById")
    public Food selectFoodById(int id ,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return foodService.selectFoodById(id);
    }
}
