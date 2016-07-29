package com.example.sharedemo;

import android.app.Application;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by guozhk on 16-7-30.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        ShareSDK.initSDK(this);
        super.onCreate();

    }
}
