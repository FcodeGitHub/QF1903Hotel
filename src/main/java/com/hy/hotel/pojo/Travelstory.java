package com.hy.hotel.pojo;

public class Travelstory {

    private Integer id;

    private String traveladdress;

    private String addressinfo;

    private String account;

    private Byte dianzan;

    private Byte sc;

    private String info;

    private String img;
    private String stayCity;
    private Integer accountId;
    private String time;

    public Travelstory() {
    }

    public String getStayCity() {
        return stayCity;
    }

    public void setStayCity(String stayCity) {
        this.stayCity = stayCity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraveladdress() {
        return traveladdress;
    }

    public void setTraveladdress(String traveladdress) {
        this.traveladdress = traveladdress;
    }

    public String getAddressinfo() {
        return addressinfo;
    }

    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Byte getDianzan() {
        return dianzan;
    }

    public void setDianzan(Byte dianzan) {
        this.dianzan = dianzan;
    }

    public Byte getSc() {
        return sc;
    }

    public void setSc(Byte sc) {
        this.sc = sc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Travelstory{" +
                "id=" + id +
                ", traveladdress='" + traveladdress + '\'' +
                ", addressinfo='" + addressinfo + '\'' +
                ", account='" + account + '\'' +
                ", dianzan=" + dianzan +
                ", sc=" + sc +
                ", info='" + info + '\'' +
                ", img='" + img + '\'' +
                ", stayCity='" + stayCity + '\'' +
                ", accountId=" + accountId +
                ", time='" + time + '\'' +
                '}';
    }
}