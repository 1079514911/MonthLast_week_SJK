package com.example.anadministrator.monthlast;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTab;
    private ViewPager mVp;
    private List<Fragment> listFrag = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        for (int i = 0; i < 7; i++) {
            listFrag.add(new BlankFragment());
            mTab.addTab(mTab.newTab());
        }
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.setFragList(listFrag);
        mVp.setAdapter(myAdapter);
        //设置标题
        for (int i = 0; i < 7; i++) {
            mTab.getTabAt(i).setText("星期" + (i+1));
        }
    }

    //找控件
    private void initView() {
        mTab = (TabLayout) findViewById(R.id.tab);
        mVp = (ViewPager) findViewById(R.id.vp);
        //关联TabLayout和ViewPager
        mTab.setupWithViewPager(mVp);
    }
}

