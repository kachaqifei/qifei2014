package com.example.viewdemo;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class BaseActivity extends Activity {
	View myBtn1;
	View myBtn2;
	View myBtn3;
	View myBtn4;
	View myBtn5;
	View myBtn6;
	View myBtn7;
	View myBtn8;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baseview_layout);
		initEnvironment();
	}

	public void initEnvironment(){
		myBtn1=findViewById(R.id.myLinearLayout);
		myBtn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,TextViewActivity.class);
				startActivity(intent);
			}
		});
		
		myBtn2=findViewById(R.id.myFrameLayout);
	myBtn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,EditTextActivity.class);
				startActivity(intent);
			}
		});
		
	myBtn3=findViewById(R.id.myTableLayout);
      myBtn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,ImageButtonViewActivity.class);
				startActivity(intent);
			}
		});
		
		myBtn4=findViewById(R.id.myRelativeLayout);
myBtn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,CheckboxActivity.class);
				startActivity(intent);
			}
		});
		
	
		myBtn5=findViewById(R.id.myAbsoluteLayout);
myBtn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,RadioButtonActivity.class);
				startActivity(intent);
			}
		});
	
		myBtn6=findViewById(R.id.myView);
myBtn6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,ImageViewActivity.class);
				startActivity(intent);
			}
		});
	
		myBtn7=findViewById(R.id.myexample);

myBtn7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = new Intent(BaseActivity.this,AnaDigActivity.class);
				startActivity(intent);
			}
		});

myBtn8=findViewById(R.id.myhightView);

myBtn8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		intent = new Intent(BaseActivity.this,DateTimeActivity.class);
		startActivity(intent);
	}
});




	}


}
