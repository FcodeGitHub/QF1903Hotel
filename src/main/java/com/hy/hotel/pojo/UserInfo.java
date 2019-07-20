package com.hy.hotel.pojo;

public class UserInfo {

    private int id;

    private String nickName;

    private String userlmg;

    private String phone;

    private String birthday;

    private String idCard;

    private String adress;

    private String city;

    private String email;

    private int gender;

    private String bloodType;

    private String QQ;

    private int loginId;

    public UserInfo(){}


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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
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
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", bloodType='" + bloodType + '\'' +
                ", QQ='" + QQ + '\'' +
                ", loginId=" + loginId +
                '}';
    }
}