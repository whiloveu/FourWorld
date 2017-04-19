package com.wh.lib.domain;

public class productInfoEx {
    private String productid;

    private String describeuri;

    private String imageuri;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getDescribeuri() {
        return describeuri;
    }

    public void setDescribeuri(String describeuri) {
        this.describeuri = describeuri == null ? null : describeuri.trim();
    }

    public String getImageuri() {
        return imageuri;
    }

    public void setImageuri(String imageuri) {
        this.imageuri = imageuri == null ? null : imageuri.trim();
    }
}