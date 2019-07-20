package com.hy.hotel.mapper;

import com.hy.hotel.pojo.Travelstory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TravelStoryMapper {

    public List<Travelstory> travelStory();


    Travelstory travelStoryId(int id);
}
