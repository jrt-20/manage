package com.family.manage.entity.Dao;

import java.util.List;

public class Child {
    private String title;
    private String href;
    private String icon;
    private String target;
    private List<Childitem> child;

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

    public List<Childitem> getChild() {
        return child;
    }

    public void setChild(List<Childitem> child) {
        this.child = child;
    }
}
