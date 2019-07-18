package com.hy.hotel.controller;

import com.hy.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HotelController {
    @Autowired
    HotelService hotelService;

    public String list(){
        return null;
    }

    public String showList(){
        return  null;
    }
}
