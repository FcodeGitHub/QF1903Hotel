package com.hy.hotel.pojo;

import java.util.List;

public class UserSc {
    private Integer id;

    private Integer userId;

    private int foodId;

    private int travelstoryId;

    private List<Food> foodList;

    private List<Travelstory> travelstoryList;

    public UserSc() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getTravelstoryId() {
        return travelstoryId;
    }

    public void setTravelstoryId(int travelstoryId) {
        this.travelstoryId = travelstoryId;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Travelstory> getTravelstoryList() {
        return travelstoryList;
    }

    public void setTravelstoryList(List<Travelstory> travelstoryList) {
        this.travelstoryList = travelstoryList;
    }

    @Override
    public String toString() {
        return "UserSc{" +
                "id=" + id +
                ", userId=" + userId +
                ", foodId=" + foodId +
                ", travelstoryId=" + travelstoryId +
                ", foodList=" + foodList +
                ", travelstoryList=" + travelstoryList +
                '}';
    }
}