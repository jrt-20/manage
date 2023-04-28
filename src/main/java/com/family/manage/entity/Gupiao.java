package com.family.manage.entity;

public class Gupiao {
    private Integer gid;

    private Integer uid;

    private String gtype;

    private Double gvalue;

    private Double gup;

    private Double gupyear;

    private Double pvalue;

    private String risk;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public Double getGvalue() {
        return gvalue;
    }

    public void setGvalue(Double gvalue) {
        this.gvalue = gvalue;
    }

    public Double getGup() {
        return gup;
    }

    public void setGup(Double gup) {
        this.gup = gup;
    }

    public Double getGupyear() {
        return gupyear;
    }

    public void setGupyear(Double gupyear) {
        this.gupyear = gupyear;
    }

    public Double getPvalue() {
        return pvalue;
    }

    public void setPvalue(Double pvalue) {
        this.pvalue = pvalue;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", uid=").append(uid);
        sb.append(", gtype=").append(gtype);
        sb.append(", gvalue=").append(gvalue);
        sb.append(", gup=").append(gup);
        sb.append(", gupyear=").append(gupyear);
        sb.append(", pvalue=").append(pvalue);
        sb.append(", risk=").append(risk);
        sb.append("]");
        return sb.toString();
    }
}