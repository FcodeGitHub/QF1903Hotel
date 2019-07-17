package com.hy.hotel.pojo;

public class Travelstroy {
    private Integer id;

    private String traveladdress;

    private String addressinfo;

    public Travelstroy() {
    }

    public Travelstroy(Integer id, String traveladdress, String addressinfo) {
        this.id = id;
        this.traveladdress = traveladdress;
        this.addressinfo = addressinfo;
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

    @Override
    public String toString() {
        return "Travelstroy{" +
                "id=" + id +
                ", traveladdress='" + traveladdress + '\'' +
                ", addressinfo='" + addressinfo + '\'' +
                '}';
    }
}