package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android Studio
 * Package: com.coolweather.android.gson
 * User: 11119721
 * Date: 2020/8/4
 * Time: 17:10
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
