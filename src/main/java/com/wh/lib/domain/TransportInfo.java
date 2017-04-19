package com.wh.lib.domain;

public class TransportInfo {
    private String transportid;

    private String tpcompany;

    private String tpprice;

    private String remark;

    private String address;

    public String getTransportid() {
        return transportid;
    }

    public void setTransportid(String transportid) {
        this.transportid = transportid == null ? null : transportid.trim();
    }

    public String getTpcompany() {
        return tpcompany;
    }

    public void setTpcompany(String tpcompany) {
        this.tpcompany = tpcompany == null ? null : tpcompany.trim();
    }

    public String getTpprice() {
        return tpprice;
    }

    public void setTpprice(String tpprice) {
        this.tpprice = tpprice == null ? null : tpprice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}