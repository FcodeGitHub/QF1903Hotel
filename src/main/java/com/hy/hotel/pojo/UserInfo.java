package com.hy.hotel.pojo;

public class UserInfo {

    private int id;

    private String nickName;

    private String userlmg;

    private String phone;

    private String birthday;

    private String idCard;

    private String email;

    private int gender;

    private String QQ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserlmg() {
        return userlmg;
    }

    public void setUserlmg(String userlmg) {
        this.userlmg = userlmg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", userlmg='" + userlmg + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", QQ='" + QQ + '\'' +
                '}';
    }
}