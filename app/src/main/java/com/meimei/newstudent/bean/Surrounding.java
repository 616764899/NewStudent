package com.meimei.newstudent.bean;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by 梅梅 on 2016/8/5.
 */
public class Surrounding implements Serializable{
    private String name;
    private String location;
    private String introduction;
    private Bitmap pic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Bitmap getPic() {
        return pic;
    }

    public void setPic(Bitmap pic) {
        this.pic = pic;
    }
}
