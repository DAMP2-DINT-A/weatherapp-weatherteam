package com.utad.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ubicacion extends AppCompatActivity {

    private ListView listView;
    private List<String> messagesArray;
    ListaUbicacionesAdapter listaUbicacionesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_ubicaciones);

        listView = (ListView) findViewById(R.id.listView);
        messagesArray = new ArrayList<String>();
        listaUbicacionesAdapter = new ListaUbicacionesAdapter(this, messagesArray);
        listView.setAdapter(listaUbicacionesAdapter);


        ArrayList<String> list = new ArrayList<String>();

        list.add("Madrid");
        list.add("hace un tiempo de lcoooos");


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ubicacion.this, MainActivity.class));
            }
        });
    }

    public void onSuccess(ArrayList<String> list) {
        messagesArray.add(list.get(0));
        messagesArray.add(list.get(1));

        listaUbicacionesAdapter.notifyDataSetChanged();
    }
}
