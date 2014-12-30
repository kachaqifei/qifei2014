package com.example.canvas;

import android.content.Context;  
import android.graphics.BitmapFactory;  
import android.graphics.Canvas;  
import android.graphics.Color;  
import android.graphics.Paint;  
import android.view.View;  
  
// �Զ��� view,��Ҫʵ�� һ����ʽ�Ĺ��캯������д onDraw ������һ�еĲ������ڸ÷����Ͻ���   
public class MyView extends View {  
      
  
    public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/** 
     * Ҫ��ͼ�Σ�������Ҫ���������� 
     * 1.��ɫ���� Color 
     * 2.���ʶ��� Paint 
     * 3.�������� Canvas 
     */  
      
    @Override  
    public void onDraw(Canvas canvas) {  
        // TODO Auto-generated method stub   
          
        Paint paint = new Paint();  
        paint.setColor(Color.BLACK);  
        //���������С   
        paint.setTextSize(100);  
          
        //�û�����ͼ���ǿ��ĵ�   
        paint.setStyle(Paint.Style.STROKE);  
        //���û������ߵ� ��ϸ�̶�   
        paint.setStrokeWidth(6);  
        //����һ����   
        canvas.drawLine(10, 10, 200, 200, paint);  
          
        //������   
        canvas.drawRect(0, 0, 600, 300, paint);  
          
        //��Բ   
        canvas.drawCircle(200, 200, 100, paint);  
        //�����ַ��� drawText(String text, float x, float y, Paint paint)    
        // y �� ��׼�� ������ �ַ����� �ײ�   
        canvas.drawText("apple", 60, 60, paint);  
        canvas.drawLine(0, 60, 500, 60, paint);  
          
        //����ͼƬ   
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher), 300, 500, paint);  
          
        super.onDraw(canvas);  
    }  
  
}  
