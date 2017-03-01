package com.utad.weather;

import com.activeandroid.app.Application;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by cdiaz on 1/3/17.
 */

public class WeatherApplication extends Application {

    public static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue= Volley.newRequestQueue(this);


    }
}
