package com.family.manage.entity.Dao;

import java.util.List;

public class Currency {
    private List<Child> child;
    private String title;
    private String icon;

    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "child=" + child +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
