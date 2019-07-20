package com.hy.hotel.pojo;

import java.util.Date;

public class Homestay {
    private Integer id;

    private String stayCity;

    private String name;

    private Integer num;

    private String address;

    private Double price;

    private String img;

    private Float dis;

    private String search;

    private String history;

    public Homestay() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStayCity() {
        return stayCity;
    }

    public void setStayCity(String stayCity) {
        this.stayCity = stayCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Float getDis() {
        return dis;
    }

    public void setDis(Float dis) {
        this.dis = dis;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Homestay{" +
                "id=" + id +
                ", stayCity='" + stayCity + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                ", dis=" + dis +
                ", search='" + search + '\'' +
                ", history='" + history + '\'' +
                '}';
    }
}