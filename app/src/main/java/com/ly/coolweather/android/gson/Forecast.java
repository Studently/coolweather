package com.ly.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ly on 2017/9/12.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperatrue temperatrue;

    @SerializedName("cond")
    public More more;


    public class Temperatrue{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
