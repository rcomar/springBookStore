package com.rcoyto.springBookStore.commons;

public class PageDetail {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PageDetail() {
    }

    public PageDetail(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
