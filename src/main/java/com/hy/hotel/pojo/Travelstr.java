package com.hy.hotel.pojo;

public class Travelstr {
    private Integer id;

    private String info;

    public Travelstr() {
    }

    public Travelstr(Integer id, String info) {
        this.id = id;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Travelstr{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}