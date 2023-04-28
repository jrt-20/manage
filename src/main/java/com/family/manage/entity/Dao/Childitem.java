package com.family.manage.entity.Dao;

public class Childitem {
//    private Integer id;

    private String title;

    private String href;

    private String icon;

    private String target;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
//        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", href=").append(href);
        sb.append(", icon=").append(icon);
        sb.append(", target=").append(target);
        sb.append("]");
        return sb.toString();
    }
}