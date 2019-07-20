package com.hy.hotel.pojo;

public class HotelBed {
    private Integer id;

    private Integer hotelid;

    private String type;

    private Float price;

    private Integer num;

    private String name;

    private String img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "HotelBed{" +
                "id=" + id +
                ", hotelid=" + hotelid +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
