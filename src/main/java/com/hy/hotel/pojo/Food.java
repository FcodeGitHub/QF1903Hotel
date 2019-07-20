package com.hy.hotel.pojo;

public class Food {
    private Integer id;

    private String title;

    private String info;

    private Float price;

    private String imgs;

    private Float star;

    private Byte sc;

    private String remark;

    private String activityDetails;

    private String activityInclude;

    private String address;

    public Food() {
    }

    public Food(Integer id, String title, String info, Float price, String imgs, Float star, Byte sc, String remark, String activityDetails, String activityInclude, String address) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.price = price;
        this.imgs = imgs;
        this.star = star;
        this.sc = sc;
        this.remark = remark;
        this.activityDetails = activityDetails;
        this.activityInclude = activityInclude;
        this.address = address;
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

    public Byte getSc() {
        return sc;
    }

    public void setSc(Byte sc) {
        this.sc = sc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getActivityDetails() {
        return activityDetails;
    }

    public void setActivityDetails(String activityDetails) {
        this.activityDetails = activityDetails;
    }

    public String getActivityInclude() {
        return activityInclude;
    }

    public void setActivityInclude(String activityInclude) {
        this.activityInclude = activityInclude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                ", remark='" + remark + '\'' +
                ", activityDetails='" + activityDetails + '\'' +
                ", activityInclude='" + activityInclude + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}