package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.TravelStoryMapper;
import com.hy.hotel.pojo.Travelstory;
import com.hy.hotel.service.TravelStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelStoryServiceImpl implements TravelStoryService {


    @Autowired
    TravelStoryMapper travelStoryMapper;

    @Override
    public List<Travelstory> travelStory() {

        return travelStoryMapper.travelStory();
    }
}
