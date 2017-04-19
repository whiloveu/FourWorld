package com.wh.lib.domain;

public class TransctionRecord {
    private String recordid;

    private String productid;

    private String productname;

    private String productprice;

    private Integer productnum;

    private String totalprice;

    private String offsetmoney;

    private String paymoney;

    private String remark;

    private String orderstate;

    private String logisticnum;

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice == null ? null : productprice.trim();
    }

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    public String getOffsetmoney() {
        return offsetmoney;
    }

    public void setOffsetmoney(String offsetmoney) {
        this.offsetmoney = offsetmoney == null ? null : offsetmoney.trim();
    }

    public String getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(String paymoney) {
        this.paymoney = paymoney == null ? null : paymoney.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    public String getLogisticnum() {
        return logisticnum;
    }

    public void setLogisticnum(String logisticnum) {
        this.logisticnum = logisticnum == null ? null : logisticnum.trim();
    }
}