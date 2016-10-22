package com.timestudio.mynews.entity;

import android.graphics.drawable.Drawable;

/**
 * Created by thinkpad on 2016/10/18.
 */

public class NewsTitle {

    private String title;
    private String details;
    private String time;
    private Drawable picture;

    public NewsTitle(String title, String details, String time) {
        this.title = title;
        this.details = details;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }
}
