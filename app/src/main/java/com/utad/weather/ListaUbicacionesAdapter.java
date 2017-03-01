package com.utad.weather;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mario on 01/03/2017.
 */

public class ListaUbicacionesAdapter extends ArrayAdapter<String> {

    private Context context;
    private List<String> messages;


    public ListaUbicacionesAdapter(Context context, List<String> objects) {
        super(context, 0, objects);
        this.context = context;
        this.messages = objects;
    }

    public int getCount() {
        return messages.size();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        String message = messages.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.celda, parent, false);

        ListaUbicacionesViewHolder holder = new ListaUbicacionesViewHolder();

        holder.image = (ImageView) v.findViewById(R.id.imageView);
        holder.Nombre = (TextView) v.findViewById(R.id.textView);
        holder.descipcion = (TextView) v.findViewById(R.id.textView2);

        holder.Nombre.setText("holaaa");
        holder.descipcion.setText("sdfgh");

        return v;
    }

}
