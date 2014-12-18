package com.example.piccreate;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class TakePhoActivity extends Activity implements SurfaceHolder.Callback{

	private ImageButton okBtn;
	private ImageButton deBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		

		initEnvironment();
		initWindow();
		initLayoutsAndViews();
		
	}

	private void initEnvironment() {
		
	}
	private void initWindow(){
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.takephote);
		okBtn=(ImageButton)findViewById(R.id.savedbtn);
		deBtn=(ImageButton)findViewById(R.id.redobtn);
		
		
	}
	private void initLayoutsAndViews(){
		
		
		
		
		
		
		
		
		
		
		okBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
