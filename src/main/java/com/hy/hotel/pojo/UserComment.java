package com.hy.hotel.pojo;

public class UserComment {
    private Integer id;

    private Integer userId;

    private String comment;

    private String img;

    private String userImg;

    private String nickName;

    public UserComment() {
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserComment{" +
                "id=" + id +
                ", userId=" + userId +
                ", comment='" + comment + '\'' +
                ", img='" + img + '\'' +
                ", userImg='" + userImg + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}