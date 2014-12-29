package com.example.viewdemo;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class LayoutActivity extends Activity implements OnClickListener{
	View myBtn1;
	View myBtn2;
	View myBtn3;
	View myBtn4;
	View myBtn5;
	View myBtn6;
	View myBtn7;
	View myBtn8;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);
		initEnvironment();
	}

	public void initEnvironment(){
		myBtn1=findViewById(R.id.myLinearLayout);
		myBtn1.setOnClickListener(this);
		myBtn2=findViewById(R.id.myFrameLayout);
		myBtn2.setOnClickListener(this);
		myBtn3=findViewById(R.id.myTableLayout);
		myBtn3.setOnClickListener(this);
		myBtn4=findViewById(R.id.myRelativeLayout);
		myBtn4.setOnClickListener(this);
		myBtn5=findViewById(R.id.myAbsoluteLayout);
		myBtn5.setOnClickListener(this);
		myBtn6=findViewById(R.id.mybaseView);
		myBtn6.setOnClickListener(this);
		myBtn7=findViewById(R.id.myexample);
		myBtn7.setOnClickListener(this);
		myBtn8=findViewById(R.id.myhightView);
		myBtn8.setOnClickListener(this);

	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
Intent intent;
		
		switch (v.getId()) {
		case R.id.myLinearLayout:
			intent = new Intent(LayoutActivity.this,LinearLayoutActivity.class);
			startActivity(intent);
		    break;
		case R.id.myFrameLayout:
			intent = new Intent(LayoutActivity.this,FrameActivity.class);
			startActivity(intent);
		    break;
		    
		case R.id.myTableLayout:
			intent = new Intent(LayoutActivity.this,TableActivity.class);
			startActivity(intent);
		    break;
		    
		case R.id.myRelativeLayout:
			intent = new Intent(LayoutActivity.this,RelativeActivity.class);
			startActivity(intent);
		    break;
		case R.id.myAbsoluteLayout:
			intent = new Intent(LayoutActivity.this,AbsoluteActivity.class);
			startActivity(intent);
		    break;
		case R.id.mybaseView:
			intent = new Intent(LayoutActivity.this,BaseActivity.class);
			startActivity(intent);
		    break;
		    
				default:
					break;
	}

	
}}
