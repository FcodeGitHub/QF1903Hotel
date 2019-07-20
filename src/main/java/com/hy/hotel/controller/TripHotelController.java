package com.hy.hotel.controller;

import com.hy.hotel.pojo.TripHotel;
import com.hy.hotel.service.TripHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TripHotelController {

    @Autowired
    TripHotelService tripHotelService;

    /**
     * 出行酒店查询
     */
    @RequestMapping("/selectTripHotelAll")
    public List<TripHotel> selectTripHotelAll() {
        return tripHotelService.selectTripHotelAll();
    }
}
