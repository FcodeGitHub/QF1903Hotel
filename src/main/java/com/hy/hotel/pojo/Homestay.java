package com.hy.hotel.pojo;

import java.util.Date;

public class Homestay {
    private Integer id;

    private String staycity;

    private Date begintime;

    private Date leavetime;

    private String homestayname;

    public Homestay() {
    }

    public Homestay(Integer id, String staycity, Date begintime, Date leavetime, String homestayname) {
        this.id = id;
        this.staycity = staycity;
        this.begintime = begintime;
        this.leavetime = leavetime;
        this.homestayname = homestayname;
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

    public String getHomestayname() {
        return homestayname;
    }

    public void setHomestayname(String homestayname) {
        this.homestayname = homestayname;
    }

    @Override
    public String toString() {
        return "Homestay{" +
                "id=" + id +
                ", staycity='" + staycity + '\'' +
                ", begintime=" + begintime +
                ", leavetime=" + leavetime +
                ", homestayname='" + homestayname + '\'' +
                '}';
    }
}