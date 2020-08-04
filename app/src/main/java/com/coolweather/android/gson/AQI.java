package com.coolweather.android.gson;

/**
 * Created by Android Studio
 * Package: com.coolweather.android.gson
 * User: 11119721
 * Date: 2020/8/4
 * Time: 17:08
 */
public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;
        public String pm25;
    }
}
