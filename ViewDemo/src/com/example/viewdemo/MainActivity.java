package com.example.viewdemo;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/**
 * 
 * @author 
 *
 */
public class MainActivity extends Activity implements OnClickListener{
/**
 * 
 */
	View vbtn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initEnvironment();
	}

	
	public void initEnvironment(){
		vbtn1=findViewById(R.id.myView);
		vbtn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
Intent intent;
		
		switch (v.getId()) {
		case R.id.myView:
			intent = new Intent(MainActivity.this,LayoutActivity.class);
			startActivity(intent);
		    break;
		    
				default:
					break;
		}
	}

	
}
