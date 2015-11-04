package com.kuerjinjin.kenny.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG ="kenny_log";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载布局文件
        setContentView(R.layout.activity_main);
        // 打印日志输出
        Log.i(TAG, "onCreate Method is executed!");
    }

    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, "onStart Method is executed!");
    }

    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "onRestart Method is executed!");
    }

    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume Method is executed!");
    }

    protected void onStop()
    {
        super.onStop();
        Log.i(TAG, "onStop Method is executed!");
    }

    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause Method is executed!");
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "onDestroy Method is executed!");
    }
}
