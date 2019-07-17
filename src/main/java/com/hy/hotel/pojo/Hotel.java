package com.hy.hotel.pojo;

import java.util.Date;

public class Hotel {
    private Integer id;

    private String staycity;

    private Date begintime;

    private Date leavetime;

    private String hotelname;

    public Hotel() {
    }

    public Hotel(Integer id, String staycity, Date begintime, Date leavetime, String hotelname) {
        this.id = id;
        this.staycity = staycity;
        this.begintime = begintime;
        this.leavetime = leavetime;
        this.hotelname = hotelname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaycity() {
        return staycity;
    }

    public void setStaycity(String staycity) {
        this.staycity = staycity;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", staycity='" + staycity + '\'' +
                ", begintime=" + begintime +
                ", leavetime=" + leavetime +
                ", hotelname='" + hotelname + '\'' +
                '}';
    }
}