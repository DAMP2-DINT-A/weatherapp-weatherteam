package com.utad.weather.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by alvaro.montes on 01/03/2017.
 */

@Table(name = "WeatherResult")
public class WeatherResult extends Model {

    @Column(name = "index")
    private int index; // id weather
    @Column(name = "coords")
    private Coords coords; // coords
    @Column(name = "CP")
    private long CP; // codigo postal
    @Column(name = "name")
    private String name; // city name
    @Column(name = "idCity")
    private int idCity; // city id

    public WeatherResult() {
        super();
    }

    public WeatherResult(int index, Coords coords, long CP, String name, int id) {
        this.index = index;
        this.coords = coords;
        this.CP = CP;
        this.name = name;
        this.idCity = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public long getCP() {
        return CP;
    }

    public void setCP(long CP) {
        this.CP = CP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int id) {
        this.idCity = id;
    }
}
