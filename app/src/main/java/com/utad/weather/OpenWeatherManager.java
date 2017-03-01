package com.utad.weather;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by pablo.rojas on 01/03/2017.
 */
public class OpenWeatherManager {


    private String url =  "http://api.openweathermap.org/data/2.5/weather?";

    private String ApiKey = "&appid=2561671dd40fb9f79239772713fc07e9";

    private static final String TAG= "OpenWeatherManagerApi";


    public void getWeatherByLatLon (double lat, double lon){
        url = url + "lat="+lat+"&lon="+lon+ApiKey;
        Log.d("Query",""+ url);
        JsonObjectRequest jsArrayRequest = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray weather = response.getJSONArray("weather");
                            JSONObject obj = (JSONObject) weather.get(0);
                            String main = obj.get("main").toString();
                            String description = obj.get("description").toString();


                            JSONObject objMain = response.getJSONObject("main");
                            String temperature = objMain.get("temp").toString();
                            String pressure = objMain.get("pressure").toString();
                            String humidity = objMain.get("humidity").toString();


                            JSONObject objWind = response.getJSONObject("wind");
                            String speed = objWind.get("speed").toString();
                            String deg = objWind.get("deg").toString();


                            JSONObject objSys = response.getJSONObject("wind");
                            String sunrise = objSys.get("speed").toString();
                            String sunset = objSys.get("deg").toString();

                            Log.d(TAG, "Descripcion " + main + description + temperature + pressure + humidity + speed + deg + sunrise + sunset);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d(TAG, "Error Respuesta en JSON: " + error.getMessage());

                    }
                }
        );

        WeatherApplication.requestQueue.add(jsArrayRequest);
    }

    public void getWeatherByZip(int zip, String countryCode){
        url = url + "zip="+zip+","+countryCode+ApiKey;
        Log.d("Query",""+ url);

    }

    public void getWeatherByName(String cityName){
        url = url + "q="+cityName+ApiKey;
        Log.d("Query",""+ url);
    }


}
