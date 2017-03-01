package com.utad.weather;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by carlos.marana on 01/03/2017.
 */
public class Flecha extends ImageView {

    ImageView ivFlecha;
    TextView tvVelocidad;

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

    private void inicio(){
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.flecha, this, true);

        ivFlecha = (ImageView)findViewById(R.id.ivFlecha);
        tvVelocidad = (TextView)findViewById(R.id.tvVelocidad);
    }

}
