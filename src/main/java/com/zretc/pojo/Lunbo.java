package com.zretc.pojo;

public class Lunbo {
    private int id;
    private String imageurl;
    private String title;

    public Lunbo(int id, String imageurl, String title) {
        this.id = id;
        this.imageurl = imageurl;
        this.title = title;
    }

    public Lunbo() {
    }

    public Lunbo(String imageurl, String title) {
        this.imageurl = imageurl;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
