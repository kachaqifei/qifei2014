package com.android.test;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity
{
    private CustomApplication app;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        app = (CustomApplication) getApplication(); // 获得CustomApplication对象
        
        Log.e("FirstActivity", "初始值=====" + app.getValue()); // 获取进程中的全局变量值，看是否是初始化值
        
        app.setValue("Harvey Ren"); // 重新设置值
        
        Log.e("FirstActivity", "修改后=====" + app.getValue()); // 再次获取进程中的全局变量值，看是否被修改
        
        Button btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener()
        {
            
            @Override
            public void onClick(View arg0)
            {
                // TODO Auto-generated method stub
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
              
                startActivity(intent);   
            }
        });
 
    }
}