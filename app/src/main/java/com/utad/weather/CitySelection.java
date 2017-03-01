package com.utad.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class CitySelection extends AppCompatActivity {
    EditText postalCode;
    ListView lista;
    String[] provincias;
    String cp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_selection);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                System.out.println("CHAR" + charSequence);
                changeAdapter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        provincias = new String[]{"Alava", "Albacete", "Alicante", "Almería", "Asturias", "Avila", "Badajoz", "Barcelona", "Burgos", "Cáceres",
                "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara",
                "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra",
                "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona",
                "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"};
        postalCode = (EditText) findViewById(R.id.CodigoPostal);
        lista = (ListView) findViewById(R.id.ListaCiudades);
        postalCode.addTextChangedListener(textWatcher);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, provincias);
        lista.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_favorite) {
            System.out.println();
            cp = postalCode.getText().toString();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cityselector, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void changeAdapter(CharSequence charSequence) {
        ArrayList<String> str = new ArrayList();
        for (int i = 0; i < provincias.length; i++) {
            if (provincias[i].contains(charSequence)) {
                System.out.println(provincias[i]);
                str.add(provincias[i]);
            }

        }
        System.out.println("FINALIZADO ADAPTER");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, str);
        lista.setAdapter(adapter);
    }
}
