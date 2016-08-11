package com.meimei.newstudent.utils;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by 梅梅 on 2016/8/8.
 */
public class HttpUtils {

    public static void setPic(Context context, String url, ImageView imageView){
        Picasso.with(context).load(url).into(imageView);
    }

    public static void setPic(Context context,String url,ImageView imageView,int targetWidth, int targetHeight){
        Picasso.with(context).load(url).resize(targetWidth,targetHeight).centerCrop().into(imageView);
    }
}
