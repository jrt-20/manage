package com.family.manage.entity;

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

    private Date bugtime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hid=").append(hid);
        sb.append(", uid=").append(uid);
        sb.append(", htype=").append(htype);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", xiaoqu=").append(xiaoqu);
        sb.append(", hlou=").append(hlou);
        sb.append(", hfloor=").append(hfloor);
        sb.append(", hsize=").append(hsize);
        sb.append(", publicsize=").append(publicsize);
        sb.append(", hetong=").append(hetong);
        sb.append(", zhengming=").append(zhengming);
        sb.append(", bugtime=").append(bugtime);
        sb.append("]");
        return sb.toString();
    }
}