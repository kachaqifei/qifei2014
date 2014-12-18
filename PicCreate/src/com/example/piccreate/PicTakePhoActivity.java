package com.example.piccreate;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class PicTakePhoActivity extends Activity {

	private ImageButton takeBtn;
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
		setContentView(R.layout.pic_takephote);
		takeBtn=(ImageButton)findViewById(R.id.imageButton2);
		
		
	}
	private void initLayoutsAndViews(){
		takeBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent	intent = new Intent(PicTakePhoActivity.this, TakePhoActivity.class);
				startActivity(intent);
				
			}
		});
		
	}

}
