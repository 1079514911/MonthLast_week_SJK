package com.example.anadministrator.monthlast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {

    private BaseDragZoomImageView mImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        initView();
        String name = getIntent().getStringExtra("name");
        ImageLoaderUtils.setImageView(name,this,mImage2);
    }

    private void initView() {
        mImage2 = (BaseDragZoomImageView) findViewById(R.id.image2);
    }
}
