package com.example.canvas;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends Activity implements OnClickListener {  
    /** Called when the activity is first created. */  
	Intent intent;

    /**
     * ѡ��ť
     */
    Button mybtn1;
    Button mybtn2;
    Button mybtn3;
    Button mybtn4;
    Button mybtn5;
    Button mybtn6;
    Button mybtn7;
    Button mybtn8;
    Button mybtn9;
    Button mybtn10;
    Button mybtn11;
    Button mybtn12;
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        initwindow();
         
    }
    /**
     * 初始化环境
     */
    public void initwindow(){
    	 setContentView(R.layout.activity_main);
    	 mybtn1=(Button) findViewById(R.id.mybtn1);
    	 mybtn1.setOnClickListener(this);
    	 mybtn2=(Button) findViewById(R.id.mybtn2);
    	 mybtn2.setOnClickListener(this);
    	 mybtn3=(Button) findViewById(R.id.mybtn3);
    	 mybtn3.setOnClickListener(this);
    	 mybtn4=(Button) findViewById(R.id.mybtn4);
    	 mybtn4.setOnClickListener(this);
    	 mybtn10=(Button) findViewById(R.id.mybtn10);
    	 mybtn10.setOnClickListener(this);
    	 mybtn11=(Button) findViewById(R.id.mybtn11);
    	 mybtn11.setOnClickListener(this);
    	 mybtn5=(Button) findViewById(R.id.mybtn5);
    	 mybtn5.setOnClickListener(this);
    	 mybtn6=(Button) findViewById(R.id.mybtn6);
    	 mybtn6.setOnClickListener(this);
    	 mybtn7=(Button) findViewById(R.id.mybtn7);
    	 mybtn7.setOnClickListener(this);
    	 mybtn8=(Button) findViewById(R.id.mybtn8);
    	 mybtn8.setOnClickListener(this);
    	 mybtn9=(Button) findViewById(R.id.mybtn9);
    	 mybtn9.setOnClickListener(this);
    	 
    }
    

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.mybtn1:
			intent = new Intent(MainActivity.this,LineActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn2:
			intent = new Intent(MainActivity.this,RecActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn3:
			intent = new Intent(MainActivity.this,CircleActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn4:
			intent = new Intent(MainActivity.this,OvelActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn5:
			intent = new Intent(MainActivity.this,roateActivity.class);
			startActivity(intent);
			break;
		case R.id.mybtn6:
			intent = new Intent(MainActivity.this,DoodleActivity.class);
			startActivity(intent);
			break;
		case R.id.mybtn7:
			intent = new Intent(MainActivity.this,ScalActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn8:
			intent = new Intent(MainActivity.this,ReflectActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn9:
			intent = new Intent(MainActivity.this,TrancelateActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn10:
			intent = new Intent(MainActivity.this,PathActivity.class);
			startActivity(intent);
			break;	
		case R.id.mybtn11:
			intent = new Intent(MainActivity.this,BitmapActivity.class);
			startActivity(intent);
			break;
		
		}
		// TODO Auto-generated method stub
		
	}  
}  

