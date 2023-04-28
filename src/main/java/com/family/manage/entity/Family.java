package com.family.manage.entity;

public class Family {
    private Integer fid;

    private Integer uid;

    private String fname;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Family{" +
                "fid=" + fid +
                ", uid=" + uid +
                ", fname='" + fname + '\'' +
                '}';
    }
}