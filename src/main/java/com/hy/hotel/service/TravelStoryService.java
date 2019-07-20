package com.hy.hotel.service;

import com.hy.hotel.pojo.Travelstory;

import java.util.List;

public interface TravelStoryService {

    public List<Travelstory> travelStory();


    Travelstory travelstoryId(int id);
}
