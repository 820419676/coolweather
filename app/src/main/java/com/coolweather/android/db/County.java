package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Android Studio
 * Package: com.coolweather.android.db
 * User: 11119721
 * Date: 2020/8/4
 * Time: 11:47
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
