package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.TripHotelMapper;
import com.hy.hotel.pojo.TripHotel;
import com.hy.hotel.service.TripHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripHotelServiceImpl implements TripHotelService {
    @Autowired
    TripHotelMapper tripHotelMapper;

    @Override
    public List<TripHotel> selectTripHotelAll() {
        return tripHotelMapper.selectTripHotelAll();
    }
}
