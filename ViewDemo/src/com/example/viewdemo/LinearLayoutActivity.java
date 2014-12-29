package com.example.viewdemo;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class LinearLayoutActivity extends Activity {
View btn1;
View btn2;
View btn3;
View btn4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linearlayout);
		btn1=findViewById(R.id.horizontal);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent = new Intent(LinearLayoutActivity.this,LinearHorizontalActivity.class);
				startActivity(intent);
				
			}
		});
		btn2=findViewById(R.id.vertical);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent = new Intent(LinearLayoutActivity.this,LinearVerticalActivity.class);
				startActivity(intent);
			}
		});
		btn3=findViewById(R.id.myweight);
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent = new Intent(LinearLayoutActivity.this,LinearWeightActivity.class);
				startActivity(intent);
			}
		});
		

	}



}