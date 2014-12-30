package com.example.canvas;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class OvelActivity extends Activity {
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
			paint = new Paint();
			// TODO Auto-generated constructor stub
		}
	
		protected void onDraw(Canvas canvas){
			paint = new Paint();
			paint.setColor(Color.RED);
			paint.setStrokeWidth(12);
			//
			//定义一个矩形区域       
			RectF oval = new RectF(0,0,200,300);       //矩形区域内切椭圆    
			canvas.drawOval(oval, paint);  
	
	}

}
}