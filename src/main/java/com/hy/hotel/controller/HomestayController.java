package com.hy.hotel.controller;

import com.hy.hotel.pojo.Homestay;
import com.hy.hotel.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomestayController {
    @Autowired
    HomestayService homestayService;

    /**
     * 查询所有
     */
    @RequestMapping("/selectHomestayAll")
    public List<Homestay> selectHomestayAll() {
        return homestayService.selectHomestayAll();
    }
}
