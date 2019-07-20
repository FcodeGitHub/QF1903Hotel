package com.hy.hotel.pojo;

public class Food {
    private Integer id;

    private String title;

    private String info;

    private Float price;

    private String imgs;

    private Float star;

    private boolean sc;

    private String remark;

    private String active;

    private String city;

    private String name;

    private Integer foodExperienceId;

    private FoodExperience foodExperience;

    private String sponsorInfo;

    private String sponsorImg;

    public Food() {
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

    public boolean isSc() {
        return sc;
    }

    public void setSc(boolean sc) {
        this.sc = sc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFoodExperienceId() {
        return foodExperienceId;
    }

    public void setFoodExperienceId(Integer foodExperienceId) {
        this.foodExperienceId = foodExperienceId;
    }

    public FoodExperience getFoodExperience() {
        return foodExperience;
    }

    public void setFoodExperience(FoodExperience foodExperience) {
        this.foodExperience = foodExperience;
    }

    public String getSponsorInfo() {
        return sponsorInfo;
    }

    public void setSponsorInfo(String sponsorInfo) {
        this.sponsorInfo = sponsorInfo;
    }

    public String getSponsorImg() {
        return sponsorImg;
    }

    public void setSponsorImg(String sponsorImg) {
        this.sponsorImg = sponsorImg;
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
                ", active='" + active + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", foodExperienceId=" + foodExperienceId +
                ", foodExperience=" + foodExperience +
                '}';
    }
}