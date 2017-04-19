package com.wh.lib.domain;

public class Address {
    private Integer addressid;

    private String country;

    private String shengfen;

    private String city;

    private String dist;

    private String detail;

    private String consigneename;

    private String consigneephone;

    private String defaultaddr;

    private Integer customerid;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getShengfen() {
        return shengfen;
    }

    public void setShengfen(String shengfen) {
        this.shengfen = shengfen == null ? null : shengfen.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist == null ? null : dist.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getConsigneename() {
        return consigneename;
    }

    public void setConsigneename(String consigneename) {
        this.consigneename = consigneename == null ? null : consigneename.trim();
    }

    public String getConsigneephone() {
        return consigneephone;
    }

    public void setConsigneephone(String consigneephone) {
        this.consigneephone = consigneephone == null ? null : consigneephone.trim();
    }

    public String getDefaultaddr() {
        return defaultaddr;
    }

    public void setDefaultaddr(String defaultaddr) {
        this.defaultaddr = defaultaddr == null ? null : defaultaddr.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }
}