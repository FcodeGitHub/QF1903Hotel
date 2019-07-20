package com.hy.hotel.controller;

import com.hy.hotel.pojo.TripHotel;
import com.hy.hotel.service.TripHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class TripHotelController {

    @Autowired
    TripHotelService tripHotelService;

    /**
     * 出行酒店查询
     */
    @RequestMapping("/selectTripHotelAll")
    public List<TripHotel> selectTripHotelAll(HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return tripHotelService.selectTripHotelAll();
    }
}
