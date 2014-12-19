package com.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity
{
    private CustomApplication app;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        app = (CustomApplication) getApplication(); // 获取应用程序
        Log.e("SecondActivity", "当前值=====" + app.getValue());
        
        // 获取全局值
    }
}
