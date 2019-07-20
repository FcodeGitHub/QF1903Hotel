package com.hy.hotel.service.impl;

import com.hy.hotel.mapper.HomestayMapper;
import com.hy.hotel.pojo.Homestay;
import com.hy.hotel.pojo.HotelBed;
import com.hy.hotel.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomestayServiceImpl implements HomestayService {
    @Autowired
    HomestayMapper homestayMapper;

    @Override
    public List<Homestay> selectHomestayAll() {
        return homestayMapper.selectHomestayAll();
    }

    @Override
    public List<HotelBed> selectHotelBedId(int id) {
        return homestayMapper.selectHotelBedId(id);
    }
}
