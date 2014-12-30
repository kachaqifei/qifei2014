package com.example.canvas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CircleActivity extends Activity {
	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));

	}

	private static class SampleView extends View {
		Paint paint;

		public SampleView(Context context) {
			super(context);
			
			// TODO Auto-generated constructor stub
		}
	
		protected void onDraw(Canvas canvas){
			paint = new Paint();
			paint.setColor(Color.RED);
			paint.setStrokeWidth(12);
			//
			paint.setStyle(Style.STROKE);
			canvas.drawCircle(100, 100, 35, paint);
			paint.setColor(Color.BLUE);
			paint.setStrokeWidth(8);
			paint.setDither(true);//防抖动
			paint.setAntiAlias(true);//防锯齿
			canvas.drawCircle(250, 400, 200, paint);
			
			/**
			 * 画扇形
			 */
			paint.setColor(Color.GREEN);
			RectF rect = new RectF(100, 100, 400, 400);                                                                                                                                        
			 canvas.drawArc(rect, //弧线所使用的矩形区域大小             
					 0,  //开始角度            
					 90, //扫过的角度           
					 true, //是否使用中心    
					 paint);   
			
			/**
			 * 画弧线区域
			 */
			 paint.setColor(Color.GRAY);
				RectF re = new RectF(100, 10, 400, 310);                                                                                                                                        
				 canvas.drawArc(re, //弧线所使用的矩形区域大小             
						 0,  //开始角度            
						 -90, //扫过的角度         ,这样设置弧形会在矩形区域的右上  , 至于其他的位置原理也是相同的。
						false, //是否使用中心    
						 paint);  
	}

}
}