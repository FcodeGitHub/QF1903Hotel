package com.hy.hotel.pojo;

public class TripHotel {
    private Integer id;

    private String imgs;

    private String title;

    private Float price;

    private Float star;

    private Integer num;

    private String city;

    public TripHotel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getStar() {
        return star;
    }

    public void setStar(Float star) {
        this.star = star;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "TripHotel{" +
                "id=" + id +
                ", imgs='" + imgs + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", star=" + star +
                ", num=" + num +
                ", city='" + city + '\'' +
                '}';
    }
}