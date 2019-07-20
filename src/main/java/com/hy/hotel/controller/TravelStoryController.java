package com.hy.hotel.controller;

import com.hy.hotel.pojo.Travelstory;
import com.hy.hotel.service.TravelStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class TravelStoryController {

    @Autowired
    TravelStoryService travelStoryService;

    @RequestMapping("/travelStory")
    public List<Travelstory> travelStory(HttpServletResponse response){

        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");

        return travelStoryService.travelStory();
    }

    //查询
    @RequestMapping("travelstoryId")
    public Travelstory travelstoryId(HttpServletResponse response,int id){
        //解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        return travelStoryService.travelstoryId(id);
    }
}
