package com.utad.weather.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.HashMap;

/**
 * Created by alvaro.montes on 01/03/2017.
 */

@Table(name = "Weather")
public class WeatherResponse extends Model {
    @Column(name = "coords")
    private Coords coords;
    @Column(name = "weather")
    private Weather weather;
    @Column(name = "base")
    private String base; // May be null, Internal parameter
    @Column(name = "main")
    private Main main;
    @Column(name = "wind")
    private Wind wind;
    @Column(name = "clouds")
    private float clouds; // Cloudiness, %
    @Column(name = "dt")
    private long dt; // Time of data calculation, unix, UTC
    @Column(name = "sys")
    private Sys sys;
    @Column(name = "idCity")
    private long idCity; // City ID
    @Column(name = "name")
    private String name; // City name
    @Column(name = "cod")
    private long cod; // Internal parameter

    public WeatherResponse(){
        super();
    }

    public WeatherResponse(Coords coords, Weather weather, String base, Main main, Wind wind, float clouds, long dt, Sys sys, long idCity, String name, long cod) {
        this.coords = coords;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;

        this.dt = dt;
        this.sys = sys;
        this.idCity = idCity;
        this.name = name;
        this.cod = cod;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public float getClouds() {
        return clouds;
    }

    public void setClouds(float clouds) {
        this.clouds = clouds;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public long getIdCity() {
        return idCity;
    }

    public void setIdCity(long idCity) {
        this.idCity = idCity;
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