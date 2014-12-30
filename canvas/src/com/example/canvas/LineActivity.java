package com.example.canvas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LineActivity extends Activity {
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
			paint.setColor(Color.YELLOW); // 设置一个笔刷大小是3的黄色的画笔
			paint.setStrokeJoin(Paint.Join.ROUND);
			paint.setStrokeCap(Paint.Cap.ROUND);
			paint.setStrokeWidth(3);
			// TODO Auto-generated constructor stub
		}
		// 在这里我们将测试canvas提供的绘制图形方法
		protected void onDraw(Canvas canvas){
		canvas.drawLine(10, 10, 100, 100, paint);  
		//画另一条线。这里onDraw里面的参数将会覆盖上面设置的参数,希望各位同仁理解之
		paint.setColor(Color.BLUE);
		canvas.drawLine(50, 50, 400, 300, paint);
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(6);//设置画笔的大小
		paint.setAntiAlias(true); //防锯齿
		canvas.drawLine(300, 10, 10, 300, paint);
		
		paint.setColor(Color.RED);
		paint.setStrokeWidth(10);
		canvas.drawLine(10, 400, 400, 400, paint);
		
		
		
		paint.setColor(Color.BLACK);
		paint.setStrokeWidth(20);
		canvas.drawLine(20, 400, 450, 800, paint);
		
	}

}
}