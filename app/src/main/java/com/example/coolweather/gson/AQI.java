package com.example.coolweather.gson;

/**
 * Created by Administrator on 2018/3/27.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;

        public String qlty;
    }
}
