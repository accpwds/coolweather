package com.example.coolweather.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by Administrator on 2018/3/26.
 *
 *  全局 Context 获取类
 */

public class GlobalApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {

        super.onCreate();
        //获取全局Context
        context = getApplicationContext();
        //初始化LitePal
        LitePalApplication.initialize(context);
    }

    public static Context getContext(){

        return context;
    }
}
