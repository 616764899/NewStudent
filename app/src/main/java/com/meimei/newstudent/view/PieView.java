package com.meimei.newstudent.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.meimei.newstudent.R;

import java.text.NumberFormat;

/**
 * Created by 梅梅 on 2016/8/5.
 */
public class PieView extends View{
    final String TAG = "PieView";

    final double d = Math.PI/180; //单位度
    final float OUTSIDE_D = 3;// 圆角角度
    final float D = 360;  //圆周角360度
    final float a = 15;  //饼图开始时的角度

    private int mTitleTextSize;  //园内字体的大小
    private int mTitleStyle;  //圆内的字体样式
    private int mTitleRadius;  //圆的半径
    private int mTitleNumber;  //园要分成的块数
    double x ,y ,z ,h ; //每块区域占的百分比

    private Paint paint;
    private Rect mBound;
    private RectF rectF;

    float start1,end1,start2,end2,start3,end3,start4,end4;  //扇形开始的角度和结束的角度

    public PieView(Context context) {
        this(context,null);
    }

    public PieView(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public PieView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.PieView,defStyleAttr,0);
        int n = a.getIndexCount();
        for (int i=0;i < n; i++){
            int attr = a.getIndex(i);
            switch (attr){
                case R.styleable.PieView_titleTextSize:
                    // 默认设置为16sp，TypeValue也可以把sp转化为px
                    mTitleTextSize = a.getDimensionPixelSize(attr, (int) TypedValue.applyDimension(
                            TypedValue.COMPLEX_UNIT_SP,16,getResources().getDisplayMetrics()));
                    break;
                case R.styleable.PieView_titleStyle:
                    //默认设置的字体风格为10
                    mTitleStyle = a.getInteger(attr,10);
                    break;
                case R.styleable.PieView_titleRadius:
                    //默认设置的半径为宽度的3/10
                    mTitleRadius = a.getInt(attr,getWidth()*3/10);
                    break;
                case R.styleable.PieView_titleNumber:
                    mTitleNumber = a.getInt(attr,2);
            }
        }
        Log.i(TAG,"mTitleNumber:"+mTitleNumber);

        //释放公用的TypedArray
        a.recycle();

        /**
         * 获得圆的半径
         */
        paint = new Paint();
        paint.setTextSize(mTitleTextSize);
        mBound = new Rect();
        mTitleRadius = getWidth()* 3/10;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mTitleRadius = getWidth()* 3/10;
        Log.i(TAG,""+mTitleRadius);
        double x1,x2,x3,x4,y1,y2,y3,y4; //百分比数字的位置
        float x11,x22,x33,x44,y11,y22,y33,y44;  //半弧向外偏移量

        /*float a1 = start1 + a;
        float b1 = end1 + a;
        float a2 = start2+a;
        float b2 = end2+a;
        float a3 = start3+a;
        float b3 = end3+a;
        float a4 = start4 +a;
        float b4 = end4 + a;*/
        x = 54.90;
        y = 24.51;
        z = 20.59;
        float a1 = 0 + a;
        float b1 = (float) (x/100*D + a); //150+a
        float a2 = (float) (x/100*D +a);  //150+a
        float b2 = (float) ((x+y)/100*D + a);     //270+a
        float a3 = (float) ((x+y)/100*D + a);     //270+a
        float b3 = D + a;     //360+a
        float number_xy1 = (float) (a + x/100*360/2);
        float number_xy2 = (float) (a + x/100*360 + y/100*360/2);
        float number_xy3 = (float) (a + (x+y)/100*360 + z/100*360/2);


        x1 = mTitleRadius * Math.cos((a + x/100*360/2)*d) *2/ 3 + getWidth() / 2;    //百分比数字的x,y坐标
        y1 = mTitleRadius * Math.sin((a + x/100*360/2)*d) *2/ 3 + getWidth() / 2;
        x11 = (float) (mTitleRadius * Math.cos((a + x/100*360/2)*d)/50);        //小半圆弧的中间的空隙
        y11 = (float) (mTitleRadius * Math.sin((a + x/100*360/2)*d)/50);

        x2 = mTitleRadius * Math.cos((a + x/100*360 + y/100*360/2)*d) *2/ 3 + getWidth() / 2;
        y2 = mTitleRadius * Math.sin((a + x/100*360 + y/100*360/2)*d) *2/ 3 + getWidth() / 2;
        x22 = (float) (mTitleRadius * Math.cos((a + x/100*360 + y/100*360/2)*d)/50);
        y22 = (float) (mTitleRadius * Math.sin((a + x/100*360 + y/100*360/2)*d)/50);

        x3 = mTitleRadius * Math.cos((a + x/100*360 + y/100*360 + z/100*360/2)*d) *2/ 3 + getWidth() / 2;
        y3 = mTitleRadius * Math.sin((a + x/100*360 + y/100*360 + z/100*360/2)*d) *2/ 3 + getWidth() / 2;
        x33 = (float) (mTitleRadius * Math.cos((a + x/100*360 + y/100*360 + z/100*360/2)*d)/50);
        y33 = (float) (mTitleRadius * Math.sin((a + x/100*360 + y/100*360 + z/100*360/2)*d)/50);

        /*x4 = r * Math.cos((a + (b1-a1) + (b2-a2) + (b3-a2) + (b4-a4)/2)*d) *2/ 3 + getWidth() / 2;
        y4 = r * Math.sin((a + (b1-a1) + (b2-a2) + (b3-a3) + (b4-a4)/2)*d) *2/ 3 + getWidth() / 2;
        x44 = (float) (r * Math.cos((a + (b1-a1) + (b3-a3) + (b4-a4)/2)*d)/50);
        y44 = (float) (r * Math.sin((a + (b1-a1) + (b3-a3) + (b4-a4)/2)*d)/50);*/

        mDrawFan(canvas,0xFFCFCDFC,x11,y11,a1,b1);

        mDrawFan(canvas,0xFFB9E6FE,x22,y22,a2,b2);

        mDrawFan(canvas,0xFFFEC7E3,x33,y33,a3,b3);

        //中间的空心圆
        paint.reset();
        paint.setColor(Color.WHITE);
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, 80, paint);

        //百分比数字
        /*paint.reset();
        paint.setColor(0xFF5817B0);
        paint.setTextSize(50);

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);*/

        mDrawText(canvas,0xFF5817B0,number_xy1);
        mDrawText(canvas,0xFF5817B0,number_xy2);
        mDrawText(canvas,0xFF5817B0,number_xy3);

        /*canvas.drawText(numberFormat.format( (b1-a1) / D *100)+"%", (float) x1, (float) y1, paint);

        paint.setColor(0xFF196791);
        canvas.drawText(numberFormat.format( (b2-a2) / D *100)+"%", (float) x2, (float) y2, paint);

        paint.setColor(0XFFd6468e);
        canvas.drawText(numberFormat.format( (b3-a3) / D *100)+"%", (float) x3, (float) y3, paint);*/

    }

    private void mDrawFan(Canvas canvas,int color,float x11,float y11,float start1,float end1){

        float r1 = (float) (Math.tan(OUTSIDE_D*d)/(1+Math.tan(OUTSIDE_D*d)) * mTitleRadius);  //小圆角 圆的半径
        float r2 = (float) (r1/Math.sin(OUTSIDE_D*d));  //内圆弧半径
        float r3 = mTitleRadius - r1;
        float ax = (float) (r3*Math.cos((start1+OUTSIDE_D)*d) + getWidth()/2) + x11;    //起始端小圆的圆心x,y
        float ay = (float) (r3*Math.sin((start1+OUTSIDE_D)*d) + getWidth()/2) + y11;
        float bx = (float) (r3*Math.cos((end1-OUTSIDE_D)*d) + getWidth()/2) + x11;      //末尾端小圆的圆心x,y
        float by = (float) (r3*Math.sin((end1-OUTSIDE_D)*d) + getWidth()/2) + y11;
        paint.reset();
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);  //抗锯齿
        rectF = new RectF(getWidth()/2 - mTitleRadius + x11, getWidth()/2 -mTitleRadius +y11, getWidth()/2 + mTitleRadius + x11, getWidth()/2 + mTitleRadius + y11);
        canvas.drawArc(rectF, start1+OUTSIDE_D, (end1-start1)-2*OUTSIDE_D, true, paint);
        rectF.set(getWidth()/2 - r2 +x11,getWidth()/2 -r2+y11,getWidth()/2 + r2+x11,getWidth()/2 + r2 +y11);
        canvas.drawArc(rectF,start1,end1-start1,true,paint);
        canvas.drawCircle(ax,ay,r1,paint);
        canvas.drawCircle(bx,by,r1,paint);

        /*paint.setStyle(Paint.Style.STROKE);
        paint.setColor(0xFF5817B0);
        paint.setStrokeWidth(10);
        invalidate(); //重绘*/
    }

    private void mDrawText(Canvas canvas,int color,float number_xy){

        double x1 = mTitleRadius * Math.cos((number_xy)) *2/ 3 + getWidth() / 2;    //百分比数字的x,y坐标
        double y1 = mTitleRadius * Math.sin((number_xy)) *2/ 3 + getWidth() / 2;

        paint.reset();
        paint.setColor(color);
        paint.setTextSize(50);

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);

        canvas.drawText(numberFormat.format( (x/100*360) / D *100)+"%", (float) x1, (float) y1, paint);

    }

}
