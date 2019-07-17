package com.hy.hotel.pojo;

import java.util.Date;

public class Shortrental {
    private Integer id;

    private String staycity;

    private Date begintime;

    private Date leavetime;

    private String shortrentalname;

    public Shortrental() {
    }

    public Shortrental(Integer id, String staycity, Date begintime, Date leavetime, String shortrentalname) {
        this.id = id;
        this.staycity = staycity;
        this.begintime = begintime;
        this.leavetime = leavetime;
        this.shortrentalname = shortrentalname;
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

    public String getShortrentalname() {
        return shortrentalname;
    }

    public void setShortrentalname(String shortrentalname) {
        this.shortrentalname = shortrentalname;
    }

    @Override
    public String toString() {
        return "Shortrental{" +
                "id=" + id +
                ", staycity='" + staycity + '\'' +
                ", begintime=" + begintime +
                ", leavetime=" + leavetime +
                ", shortrentalname='" + shortrentalname + '\'' +
                '}';
    }
}