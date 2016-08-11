package com.meimei.newstudent.bean;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by 梅梅 on 2016/8/4.
 */
public class Dormitory implements Serializable{
    private Bitmap pic;
    private String introduce;

    public Bitmap getPic() {
        return pic;
    }

    public void setPic(Bitmap pic) {
        this.pic = pic;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
