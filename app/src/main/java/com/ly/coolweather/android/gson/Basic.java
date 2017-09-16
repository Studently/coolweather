package com.ly.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ly on 2017/9/12.
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
