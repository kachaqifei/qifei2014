package com.example.drawabledemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView image=(ImageView)findViewById(R.id.myImageView);
		//��ʾdrawable�е�you ��Ƭ
		image.setImageDrawable(getResources().getDrawable(R.drawable.you));
		//����ʼ��Button
		Button btn=(Button)findViewById(R.id.Button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	

}
