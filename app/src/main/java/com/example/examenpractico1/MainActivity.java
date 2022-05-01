package com.example.examenpractico1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListViewAdapter adapter; // sirve para cargar listview
    ListView lista;


    String[] titulo = new String[]{"Note 20 ultra","Bandera"};
    int[] imagenes = {
            R.drawable.noteultra,
            R.drawable.bandera
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.listview1);

        adapter = new ListViewAdapter(this,titulo,imagenes);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Usted Presiono"+(int)(i+1),Toast.LENGTH_SHORT);
                if(i==0){
                    Intent celular = new Intent(MainActivity.this,infoTelefono.class);
                    startActivity(celular);
                }else if(i==1){
                    Intent pais = new Intent(MainActivity.this,transicion.class);
                    startActivity(pais);
                }

            }
        });
    }
}