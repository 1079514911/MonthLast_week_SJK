package com.example.anadministrator.monthlast;

import android.app.Application;

import org.xutils.x;


/**
 * Created by 张祺钒
 * on2017/8/24.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
