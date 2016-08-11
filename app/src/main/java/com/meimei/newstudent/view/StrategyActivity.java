package com.meimei.newstudent.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.text.NumberFormat;


public class StrategyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MView(this, null));

    }

    class MView extends View {

        private int mTitleRadius;
        Paint paint;
        RectF rectF;


        public MView(Context context, AttributeSet attrs) {
            super(context, attrs);
            paint = new Paint();
            mTitleRadius = 324;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            double d = Math.PI/180; //单位度
            float OUTSIDE_D = 3;// 圆角角度

            double x1,x2,x3,y1,y2,y3; //百分比数字的位置
            float x11,x22,x33,y11,y22,y33;  //半弧向外偏移量
            float ax,ay,bx,by,cx,cy,dx,dy,ex,ey,fx,fy;   //六个小圆的圆心位置
            float a = 15;
            float a1 = 0 + a;
            float b1 = 150 + a;
            float a2 = 150+a;
            float b2 = 270+a;
            float a3 = 270+a;
            float b3 = 360+a;
            float D = 360;
            float r = 3 * getWidth() / 10;  // 大圆半径，外圆弧半径
            float r1 = (float) (Math.tan(OUTSIDE_D*d)/(1+Math.tan(OUTSIDE_D*d)) * r);  //小圆角 圆的半径
            float r2 = (float) (r1/Math.sin(OUTSIDE_D*d));  //内圆弧半径
            float r3 = r - r1;

            x1 = r * Math.cos((a + (b1-a1)/2)*d) *2/ 3 + getWidth() / 2;
            y1 = r * Math.sin((a + (b1-a1)/2)*d) *2/ 3 + getWidth() / 2;  //百分比数字的坐标
            x11 = (float) (r * Math.cos((a + (b1-a1)/2)*d)/50);
            y11 = (float) (r * Math.sin((a + (b1-a1)/2)*d)/50);  //小半圆弧的中间的空隙

            x2 = r * Math.cos((a + (b1-a1) + (b2-a2)/2)*d) *2/ 3 + getWidth() / 2;
            y2 = r * Math.sin((a + (b1-a1) + (b2-a2)/2)*d) *2/ 3 + getWidth() / 2;
            x22 = (float) (r * Math.cos((a + (b1-a1) + (b2-a2)/2)*d)/50);
            y22 = (float) (r * Math.sin((a + (b1-a1) + (b2-a2)/2)*d)/50);

            x3 = r * Math.cos((a + (b1-a1) + (b2-a2) + (b3-a3)/2)*d) *2/ 3 + getWidth() / 2;
            y3 = r * Math.sin((a + (b1-a1) + (b2-a2) + (b3-a3)/2)*d) *2/ 3 + getWidth() / 2;
            x33 = (float) (r * Math.cos((a + (b1-a1) + (b2-a2) + (b3-a3)/2)*d)/50);
            y33 = (float) (r * Math.sin((a + (b1-a1) + (b2-a2) + (b3-a3)/2)*d)/50);

            ax = (float) (r3*Math.cos((a1+OUTSIDE_D)*d) + getWidth()/2) + x11 ;
            ay = (float) (r3*Math.sin((a1+OUTSIDE_D)*d) + getWidth()/2) + y11;
            bx = (float) (r3*Math.cos((b1-OUTSIDE_D)*d) + getWidth()/2) + x11;
            by = (float) (r3*Math.sin((b1-OUTSIDE_D)*d) + getWidth()/2) + y11;
            cx = (float) (r3*Math.cos((a2+OUTSIDE_D)*d) + getWidth()/2) + x22;
            cy = (float) (r3*Math.sin((a2+OUTSIDE_D)*d) + getWidth()/2) + y22;
            dx = (float) (r3*Math.cos((b2-OUTSIDE_D)*d) + getWidth()/2) + x22;
            dy = (float) (r3*Math.sin((b2-OUTSIDE_D)*d) + getWidth()/2) + y22;
            ex = (float) (r3*Math.cos((a3+OUTSIDE_D)*d) + getWidth()/2) + x33;
            ey = (float) (r3*Math.sin((a3+OUTSIDE_D)*d) + getWidth()/2) + y33;
            fx = (float) (r3*Math.cos((b3-OUTSIDE_D)*d) + getWidth()/2) + x33;
            fy = (float) (r3*Math.sin((b3-OUTSIDE_D)*d) + getWidth()/2) + y33;

            paint.reset();
            paint.setColor(Color.rgb(0xCF,0xCD,0xFC));
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            Log.i("TAG","width:"+getWidth()*3/10+"mwidth:"+mTitleRadius);
            rectF = new RectF(getWidth()/2 - mTitleRadius + x11, getWidth()/2 -mTitleRadius +y11, getWidth()/2 + mTitleRadius + x11, getWidth()/2 + mTitleRadius + y11);
//            rectF = new RectF(getWidth()/5 + x11, getWidth()/5 +y11, getWidth()*4/5 + x11, getWidth()*4/5 + y11);
            canvas.drawArc(rectF, a1+OUTSIDE_D, (b1-a1)-2*OUTSIDE_D, true, paint);
            rectF.set(getWidth()/2 - r2 +x11,getWidth()/2 -r2+y11,getWidth()/2 + r2+x11,getWidth()/2 + r2 +y11);
            canvas.drawArc(rectF,a1,b1-a1,true,paint);
            canvas.drawCircle(ax,ay,r1,paint);
            canvas.drawCircle(bx,by,r1,paint);

            paint.reset();
            rectF.set(getWidth() / 5+ x22, getWidth() / 5+ y22, 4 * getWidth() / 5+ x22, 4 * getWidth() / 5+ y22);
            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            canvas.drawArc(rectF, a2+OUTSIDE_D, (b2-a2)-2*OUTSIDE_D, true, paint);
            rectF.set(getWidth()/2 - r2+x22,getWidth()/2 -r2+y22,getWidth()/2 + r2+x22,getWidth()/2 + r2+y22);
            canvas.drawArc(rectF,a2,b2-a2,true,paint);
            canvas.drawCircle(cx,cy,r1,paint);
            canvas.drawCircle(dx,dy,r1,paint);

            paint.reset();
            rectF.set(getWidth() / 5+ x33, getWidth() / 5+ y33, 4 * getWidth() / 5+ x33, 4 * getWidth() / 5+ y33);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            canvas.drawArc(rectF, a3+OUTSIDE_D, (b3-a3)-2*OUTSIDE_D, true, paint);
            rectF.set(getWidth()/2 - r2+x33,getWidth()/2 -r2+y33,getWidth()/2 + r2+x33,getWidth()/2 + r2+y33);
            canvas.drawArc(rectF,a3,b3-a3,true,paint);
            canvas.drawCircle(ex,ey,r1,paint);
            canvas.drawCircle(fx,fy,r1,paint);

            //中间的空心圆
            paint.setColor(Color.WHITE);
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, 80, paint);

            //百分比数字
            paint.reset();
            paint.setColor(Color.BLACK);
            paint.setTextSize(50);

            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(2);

            canvas.drawText(numberFormat.format( (b1-a1) / D *100)+"%", (float) x1, (float) y1, paint);

            paint.setColor(Color.GREEN);
            canvas.drawText(numberFormat.format( (b2-a2) / D *100)+"%", (float) x2, (float) y2, paint);

            paint.setColor(Color.WHITE);
            canvas.drawText(numberFormat.format( (b3-a3) / D *100)+"%", (float) x3, (float) y3, paint);

        }

    }

}
