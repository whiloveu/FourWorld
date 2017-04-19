package com.wh.lib.domain;

public class ProductInfo {
    private String productid;

    private String ddescribe;

    private String saleprice;

    private String proprice;

    private String proscribe;

    private Integer skimnum;

    private Integer successnum;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getDdescribe() {
        return ddescribe;
    }

    public void setDdescribe(String ddescribe) {
        this.ddescribe = ddescribe == null ? null : ddescribe.trim();
    }

    public String getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(String saleprice) {
        this.saleprice = saleprice == null ? null : saleprice.trim();
    }

    public String getProprice() {
        return proprice;
    }

    public void setProprice(String proprice) {
        this.proprice = proprice == null ? null : proprice.trim();
    }

    public String getProscribe() {
        return proscribe;
    }

    public void setProscribe(String proscribe) {
        this.proscribe = proscribe == null ? null : proscribe.trim();
    }

    public Integer getSkimnum() {
        return skimnum;
    }

    public void setSkimnum(Integer skimnum) {
        this.skimnum = skimnum;
    }

    public Integer getSuccessnum() {
        return successnum;
    }

    public void setSuccessnum(Integer successnum) {
        this.successnum = successnum;
    }
}