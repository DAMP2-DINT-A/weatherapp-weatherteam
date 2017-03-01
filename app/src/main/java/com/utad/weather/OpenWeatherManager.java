package com.utad.weather;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by pablo.rojas on 01/03/2017.
 */
public class OpenWeatherManager {

    private String url =  "api.openweathermap.org/data/2.5/weather?";



    public void getWeatherByLatLon (Float lat, float lon){
        url = url + "lat="+lat+"&lon="+lon;

        
    }

    public void getWeatherByZip(int zip, String countryCode){
        url = url + "zip="+zip+","+countryCode;

    }

    public void getWeatherByName(String cityName){
        url = url + "q="+cityName;
    }


}
