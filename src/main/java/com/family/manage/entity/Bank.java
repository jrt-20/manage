package com.family.manage.entity;

import java.sql.Date;

public class Bank {
    private Integer bid;

    private Integer uid;

    private String bname;

    private String umobile;

    private Double money;

    private String btype;

    private Date createtime;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bid=" + bid +
                ", uid=" + uid +
                ", bname='" + bname + '\'' +
                ", umobile='" + umobile + '\'' +
                ", money=" + money +
                ", btype='" + btype + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}