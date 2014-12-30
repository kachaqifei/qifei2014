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

public class RecActivity extends Activity {
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
			paint.setColor(Color.GREEN);
			paint.setStrokeWidth(12);
			//
			paint.setStyle(Style.STROKE);
		RectF rect = new RectF(50, 50, 200, 200);                                                                                                                                      
		canvas.drawRect(rect, paint);  
		RectF ba=new RectF(10,250,400,400);
		canvas.drawRoundRect(ba,  
				30,//x轴的半径    
				30,  //y轴的半径                               
				paint);    
		paint.setColor(Color.RED);
		paint.setStrokeWidth(1);
		paint.setAntiAlias(true);
		paint.setDither(true);
		paint.setTextSize(20f);
		canvas.drawText("这里是用canvas画出的文字‘x’,,,'y'是起始基点", 10, 100, paint);
		
		
		
		RectF cc=new RectF(210,20,300,300);
		//图片扭曲
		canvas.skew(.5f,.5f);
		paint.setColor(Color.BLUE);
		canvas.drawRect(cc, paint);
		
		
		
		
		
		
		
		
	}

}
}