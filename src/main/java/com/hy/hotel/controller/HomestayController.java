package com.hy.hotel.controller;

import com.hy.hotel.pojo.Homestay;
import com.hy.hotel.pojo.HotelBed;
import com.hy.hotel.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HomestayController {
    @Autowired
    HomestayService homestayService;

    /**
     * 查询所有
     */
    @RequestMapping("/selectHomestayAll")
    public List<Homestay> selectHomestayAll(HttpServletResponse response) {
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return homestayService.selectHomestayAll();
    }

    //通过酒店ID查询酒店的房间类型
    @RequestMapping("/selectHotelBedId")
    public List<HotelBed> selectHotelBedId(int id,HttpServletResponse response){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin","*");
        return homestayService.selectHotelBedId(id);
    }
}
