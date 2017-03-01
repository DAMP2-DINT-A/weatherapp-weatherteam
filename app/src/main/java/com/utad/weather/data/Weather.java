package com.utad.weather.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.HashMap;

/**
 * Created by alvaro.montes on 01/03/2017.
 */

@Table(name = "Weather")
public class Weather extends Model {
    @Column(name = "coords")
    private HashMap<String, Float> coords = new HashMap<String, Float>();
    @Column(name = "country")
    private HashMap country = new HashMap();
    @Column(name = "weather")
    private HashMap weather = new HashMap();
    @Column(name = "main")
    private HashMap<String, Float> main = new HashMap<String, Float>();
    @Column(name = "wind")
    private HashMap<String, Float> wind = new HashMap<String, Float>();
    @Column(name = "rain")
    private HashMap<String, Float> rain = new HashMap<String, Float>();
    @Column(name = "clouds")
    private HashMap<String, Float> clouds = new HashMap<String, Float>();
    @Column(name = "dt")
    private long dt;
    @Column(name = "id")
    private long idWeather;
    @Column(name = "name")
    private String name;
    @Column(name = "cod")
    private long cod;

    public Weather(){
        super();
    }

    public HashMap<String, Float> getCoords() {
        return coords;
    }

    public void setCoords(HashMap<String, Float> coords) {
        this.coords = coords;
    }

    public HashMap getCountry() {
        return country;
    }

    public void setCountry(HashMap country) {
        this.country = country;
    }

    public HashMap getWeather() {
        return weather;
    }

    public void setWeather(HashMap weather) {
        this.weather = weather;
    }

    public HashMap<String, Float> getMain() {
        return main;
    }

    public void setMain(HashMap<String, Float> main) {
        this.main = main;
    }

    public HashMap<String, Float> getWind() {
        return wind;
    }

    public void setWind(HashMap<String, Float> wind) {
        this.wind = wind;
    }

    public HashMap<String, Float> getRain() {
        return rain;
    }

    public void setRain(HashMap<String, Float> rain) {
        this.rain = rain;
    }

    public HashMap<String, Float> getClouds() {
        return clouds;
    }

    public void setClouds(HashMap<String, Float> clouds) {
        this.clouds = clouds;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getIdWeather() {
        return idWeather;
    }

    public void setId(long id) {
        this.idWeather = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }
}
