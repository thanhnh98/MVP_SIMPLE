package com.thanh.mvp_architecture.model;

public class PhotoModel {

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public PhotoModel(String link, String name, String des) {
        this.link = link;
        this.name = name;
        this.des = des;
    }

    String link;
    String name;
    String des;
}
