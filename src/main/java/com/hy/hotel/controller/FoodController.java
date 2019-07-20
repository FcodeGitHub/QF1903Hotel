package com.hy.hotel.controller;

import com.hy.hotel.pojo.DataResult;
import com.hy.hotel.pojo.Food;
import com.hy.hotel.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class FoodController {
    @Autowired
    FoodService foodService;

    /**
     * 查询所有
     */
    @RequestMapping("/selectFoodALl")
    @ResponseBody
    public DataResult selectFoodALl(HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return foodService.selectFoodALl();
    }

    /**
     * 通过id查询
     */
    @RequestMapping("/selectFoodById")
    @ResponseBody
    public Food selectFoodById(int id ,HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return foodService.selectFoodById(id);
    }
}
