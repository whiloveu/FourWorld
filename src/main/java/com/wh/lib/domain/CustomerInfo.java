package com.wh.lib.domain;

import java.util.Date;

public class CustomerInfo {
    private Integer customerid;

    private String cuspassword;

    private String cusname;

    private String cussex;

    private Date birthday;

    private String question1;

    private String answer1;

    private String question2;

    private String answer2;

    private String portrait;

    private String zfbaccount;

    private String sortlimit;

    private String intergration;

    private String address;

    private Integer addressid;

    private Integer ordernum;

    private Integer trandnum;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCuspassword() {
        return cuspassword;
    }

    public void setCuspassword(String cuspassword) {
        this.cuspassword = cuspassword == null ? null : cuspassword.trim();
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname == null ? null : cusname.trim();
    }

    public String getCussex() {
        return cussex;
    }

    public void setCussex(String cussex) {
        this.cussex = cussex == null ? null : cussex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1 == null ? null : question1.trim();
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1 == null ? null : answer1.trim();
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2 == null ? null : question2.trim();
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2 == null ? null : answer2.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    public String getZfbaccount() {
        return zfbaccount;
    }

    public void setZfbaccount(String zfbaccount) {
        this.zfbaccount = zfbaccount == null ? null : zfbaccount.trim();
    }

    public String getSortlimit() {
        return sortlimit;
    }

    public void setSortlimit(String sortlimit) {
        this.sortlimit = sortlimit == null ? null : sortlimit.trim();
    }

    public String getIntergration() {
        return intergration;
    }

    public void setIntergration(String intergration) {
        this.intergration = intergration == null ? null : intergration.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Integer getTrandnum() {
        return trandnum;
    }

    public void setTrandnum(Integer trandnum) {
        this.trandnum = trandnum;
    }
}