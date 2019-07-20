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

    private Integer accountId;
    private String time;

    public Travelstory() {
    }

    public Travelstory(String time,Integer id, String traveladdress, String addressinfo, String account, Byte dianzan, Byte sc, String info, String img, Integer accountId) {
        this.id = id;
        this.traveladdress = traveladdress;
        this.addressinfo = addressinfo;
        this.account = account;
        this.dianzan = dianzan;
        this.sc = sc;
        this.info = info;
        this.img = img;
        this.accountId = accountId;
        this.time = time;
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
                ", accountId=" + accountId +
                ", time='" + time + '\'' +
                '}';
    }
}