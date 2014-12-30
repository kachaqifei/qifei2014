package com.example.canvas;

import android.content.Context;  
import android.graphics.BitmapFactory;  
import android.graphics.Canvas;  
import android.graphics.Color;  
import android.graphics.Paint;  
import android.view.View;  
  
// 自定义 view,需要实现 一个显式的构造函数，重写 onDraw 方法，一切的操作都在该方法上进行   
public class MyView extends View {  
      
  
    public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/** 
     * 要画图形，最起码要有三个对象： 
     * 1.颜色对象 Color 
     * 2.画笔对象 Paint 
     * 3.画布对象 Canvas 
     */  
      
    @Override  
    public void onDraw(Canvas canvas) {  
        // TODO Auto-generated method stub   
          
        Paint paint = new Paint();  
        paint.setColor(Color.BLACK);  
        //设置字体大小   
        paint.setTextSize(100);  
          
        //让画出的图形是空心的   
        paint.setStyle(Paint.Style.STROKE);  
        //设置画出的线的 粗细程度   
        paint.setStrokeWidth(6);  
        //画出一根线   
        canvas.drawLine(10, 10, 200, 200, paint);  
          
        //画矩形   
        canvas.drawRect(0, 0, 600, 300, paint);  
          
        //画圆   
        canvas.drawCircle(200, 200, 100, paint);  
        //画出字符串 drawText(String text, float x, float y, Paint paint)    
        // y 是 基准线 ，不是 字符串的 底部   
        canvas.drawText("apple", 60, 60, paint);  
        canvas.drawLine(0, 60, 500, 60, paint);  
          
        //绘制图片   
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher), 300, 500, paint);  
          
        super.onDraw(canvas);  
    }  
  
}  

