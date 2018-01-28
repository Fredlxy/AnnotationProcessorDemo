package com.mtime.myprocessor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mtime.annotations.BindView;

public class MainActivity extends Activity {
    @BindView(R.id.tv_text)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
