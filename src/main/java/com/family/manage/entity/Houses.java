package com.family.manage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Houses {
    private Integer hid;

    private Integer uid;

    private String htype;

    private String city;

    private String area;

    private String xiaoqu;

    private String hlou;

    private String hfloor;

    private Double hsize;

    private Double publicsize;

    private String hetong;

    private String zhengming;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bugtime;

    private Double value;

    private String name;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getXiaoqu() {
        return xiaoqu;
    }

    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu;
    }

    public String getHlou() {
        return hlou;
    }

    public void setHlou(String hlou) {
        this.hlou = hlou;
    }

    public String getHfloor() {
        return hfloor;
    }

    public void setHfloor(String hfloor) {
        this.hfloor = hfloor;
    }

    public Double getHsize() {
        return hsize;
    }

    public void setHsize(Double hsize) {
        this.hsize = hsize;
    }

    public Double getPublicsize() {
        return publicsize;
    }

    public void setPublicsize(Double publicsize) {
        this.publicsize = publicsize;
    }

    public String getHetong() {
        return hetong;
    }

    public void setHetong(String hetong) {
        this.hetong = hetong;
    }

    public String getZhengming() {
        return zhengming;
    }

    public void setZhengming(String zhengming) {
        this.zhengming = zhengming;
    }

    public Date getBugtime() {
        return bugtime;
    }

    public void setBugtime(Date bugtime) {
        this.bugtime = bugtime;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Houses{" +
                "hid=" + hid +
                ", uid=" + uid +
                ", htype='" + htype + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", xiaoqu='" + xiaoqu + '\'' +
                ", hlou='" + hlou + '\'' +
                ", hfloor='" + hfloor + '\'' +
                ", hsize=" + hsize +
                ", publicsize=" + publicsize +
                ", hetong='" + hetong + '\'' +
                ", zhengming='" + zhengming + '\'' +
                ", bugtime=" + bugtime +
                ", values=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}