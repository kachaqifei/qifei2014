package com.example.canvas;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class roateActivity extends Activity {
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
			paint.setStrokeWidth(10);
			Bitmap btm = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher) ;  
			canvas.drawBitmap(btm, 50,50, paint);
			canvas.save() ; 
			
			canvas.translate(200, 200);
			canvas.rotate(30);
			canvas.drawBitmap(btm, 200, 200,paint);
			
	
	}

}
}