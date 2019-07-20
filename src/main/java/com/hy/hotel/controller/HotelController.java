package com.hy.hotel.controller;

import com.hy.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HotelController {

    @Autowired
    HotelService hotelService;

    public String list(HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        return null;
    }

    public String showList(HttpServletResponse response){

        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        return  "hhhhhhhhhhh";
    }
}
