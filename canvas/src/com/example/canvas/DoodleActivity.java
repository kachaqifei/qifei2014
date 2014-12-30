package com.example.canvas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Menu;
import android.view.View;

public class DoodleActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SampleView(this));
	}

	private static class SampleView extends View {
		private static final int LAYER_FLAGS = Canvas.MATRIX_SAVE_FLAG | Canvas.CLIP_SAVE_FLAG |
				Canvas.HAS_ALPHA_LAYER_SAVE_FLAG | Canvas.FULL_COLOR_LAYER_SAVE_FLAG | Canvas.CLIP_TO_LAYER_SAVE_FLAG;
		private Paint mPaint;

		public SampleView(Context context) {
			super(context);
			setFocusable(true);
			mPaint = new Paint();
			mPaint.setAntiAlias(true);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			canvas.drawColor(Color.WHITE);
			canvas.translate(30, 10);
			mPaint.setColor(Color.RED);
			canvas.drawCircle(75, 75, 75, mPaint);
			canvas.saveLayerAlpha(0, 0, 200, 200, 0x88, LAYER_FLAGS);
			mPaint.setColor(Color.BLUE);
			canvas.drawCircle(125, 125, 75, mPaint);
			canvas.restore();
		}
	}
}