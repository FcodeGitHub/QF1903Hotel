package com.hy.hotel.pojo;

public class Food {
    private Integer id;

    private String title;

    private String info;

    private Float price;

    private String imgs;

    private Float star;

    private boolean sc;

    public Food() {
    }

    public Food(Integer id, String title, String info, Float price, String imgs, Float star, boolean sc) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.price = price;
        this.imgs = imgs;
        this.star = star;
        this.sc = sc;
    }

    public boolean isSc() {
        return sc;
    }

    public void setSc(boolean sc) {
        this.sc = sc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public Float getStar() {
        return star;
    }

    public void setStar(Float star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", imgs='" + imgs + '\'' +
                ", star=" + star +
                ", sc=" + sc +
                '}';
    }
}