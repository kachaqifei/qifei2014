package com.example.canvas;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

public class PathActivity extends Activity {
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
			Path path1=new Path();  
	        path1.moveTo(180, 200);  
	        path1.lineTo(200, 200);  
	        path1.lineTo(210, 210);  
	        path1.lineTo(200, 220);  
	        path1.lineTo(180, 220);  
	        path1.lineTo(170, 210);  
	        path1.close();//封闭   
	        canvas.drawPath(path1, paint); 
	        paint.setColor(Color.BLUE);
	        paint.setStrokeWidth(5);
	        paint.setStyle(Style.STROKE);
	        Path path = new Path(); //定义一条路径       
	        path.moveTo(10, 10); //移动到 坐标10,10  
	        path.lineTo(100, 100);    
	        path.lineTo(300,200);     
	        path.lineTo(10, 10);                                                                                                                                     
	        canvas.drawPath(path, paint);   
	        paint.setAntiAlias(true);
	        paint.setDither(true);
	        paint.setStrokeWidth(1);
	        paint.setColor(Color.BLACK);
	        paint.setTextSize(20f);
	        Path path2 = new Path(); //定义一条路径               path.moveTo(10, 10); //移动到 坐标10,10       
	        path2.moveTo(20, 100);
	        path2.lineTo(20, 100);           
	        path2.lineTo(400,600);          
	        path2.lineTo(400, 200);                                                                                                                                     //          canvas.drawPath(path, paint);              
	        canvas.drawTextOnPath("咔嚓截屏是一款最好的截屏工具，把用户放在首位，把质量放在首位，把体验放在首位，相信未来会赢得用户的选择。", path2, 10, 10, paint);   
	        
	
	}

}
}