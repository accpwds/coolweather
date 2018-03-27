package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/3/19.
 *
 * sendOkHttpRequest 从服务器端获取数据
 *
 */

public class HttpUtil {


    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
