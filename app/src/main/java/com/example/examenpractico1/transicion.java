package com.example.examenpractico1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class transicion extends AppCompatActivity {
    Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicion);

        btnRegresar = findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(transicion.this, MainActivity.class);
                startActivity(act2);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){ //define el menu overflow
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        //Obtener que item es el seleccionado por medio de una variable int
        int id = item.getItemId();

        //Preguntar si se ha presionado el item 0 con id item1
        if(id == R.id.item1){
            //Llamada a la nueva activity con la información de transicion para luego presionar el item1 que nos dirigira a la informacion del pais...
            Intent infoPais = new Intent(transicion.this,infoPais.class);
            startActivity(infoPais);
        }

        return super.onOptionsItemSelected(item);
    }
}