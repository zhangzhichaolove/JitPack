package com.peak.jitpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.peak.toast.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtil.show(this,"提示!");
    }
}