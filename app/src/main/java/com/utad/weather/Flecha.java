package com.utad.weather;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by carlos.marana on 01/03/2017.
 */
public class Flecha extends LinearLayout {

    ImageView ivFlecha;
    TextView tvVelocidad;
    private Animation tD;

    public Flecha(Context context) {
        super(context);
        inicio();
    }

    public Flecha(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicio();
    }

    public Flecha(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inicio();
    }


    private void inicio() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        li.inflate(R.layout.flecha, this, true);
        ivFlecha = (ImageView) findViewById(R.id.ivFlecha);
        tvVelocidad = (TextView) findViewById(R.id.tvVelocidad);
    }

    public void setRotation(float posicion) {

        ivFlecha.setRotation(posicion);
    }

    public void setVelocidad(float velocidad) {

        tvVelocidad.setText(velocidad + " MPS");

    }

}
