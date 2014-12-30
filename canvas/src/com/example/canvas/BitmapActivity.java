package com.example.canvas;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class BitmapActivity extends Activity {
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
			canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher), 100, 100, paint);  
	
	}

}
}