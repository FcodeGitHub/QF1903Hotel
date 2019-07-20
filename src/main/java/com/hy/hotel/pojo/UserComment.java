package com.hy.hotel.pojo;

public class UserComment {
    private Integer id;

    private String comment;

    private String img;

    private String userImg;

    private String nickName;

    private String time;

    private String reply;

    public UserComment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "UserComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", img='" + img + '\'' +
                ", userImg='" + userImg + '\'' +
                ", nickName='" + nickName + '\'' +
                ", time='" + time + '\'' +
                ", reply='" + reply + '\'' +
                '}';
    }
}