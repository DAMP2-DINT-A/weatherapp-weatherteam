package com.utad.weather;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by konox on 01/03/2017.
 */

public class ItemChanged extends LinearLayout{
    TextView tDia;
    TextView tTempC;
    TextView tTempF;
    ImageView iWeather;



    public ItemChanged(Context context) {
        super(context);
    }

    public ItemChanged(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ItemChanged(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void inicio(){
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        li.inflate(R.layout.flecha, this, true);

        tDia = (TextView) findViewById(R.id.day);
        tTempC = (TextView) findViewById(R.id.tempC);
        tTempF = (TextView) findViewById(R.id.tempF);
        iWeather = (ImageView) findViewById(R.id.imageView);

    }

    public void setDay(String day){
        tDia.setText(day);
    }

    public  void setGradosC(String tempC){
        tTempC.setText(tempC);
    }

    public  void setGradosF(String tempF){

        tTempF.setText(tempF);
    }

    public void setImage(int img){
        iWeather.setImageResource(img);
    }


}
