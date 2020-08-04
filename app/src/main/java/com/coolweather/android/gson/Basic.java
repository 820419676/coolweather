package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android Studio
 * Package: com.coolweather.android.gson
 * User: 11119721
 * Date: 2020/8/4
 * Time: 17:05
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
