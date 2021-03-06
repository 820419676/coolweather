package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Android Studio
 * Package: com.coolweather.android.gson
 * User: 11119721
 * Date: 2020/8/4
 * Time: 17:12
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
