package com.example.examenpractico1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class infoTelefono extends AppCompatActivity {
    WebView html;
    String texto;
    Button btnRegresarTelefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_telefono);

        btnRegresarTelefono = findViewById(R.id.btnRegresarTelefono);

        btnRegresarTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(infoTelefono.this, MainActivity.class);
                startActivity(act2);
            }
        });

        html = findViewById(R.id.webView);
        texto = "<html>" +
                "<body>";
        texto+= "<div style='border-radius: 25px; border-style:solid; padding: 10px;border-width: 2px'>";
        texto+= "<p>Samsung se mantiene como tótem del mercado móvil (y otros tantos) y no nos ha dejado sin <a href=\"https://www.xataka.com/tag/samsung-unpacked-2020\">su segundo Unpacked del año</a>, bien cargado y con dos (quizás tres) de sus buques insignia. Todos ellos con un claro capitán que hereda el apellido grandilocuente de moda y que hemos podido destripar en el <strong>análisis del Samsung Galaxy Note 20 Ultra</strong>, junto a su fiel escudero el S Pen.</p>";
        texto+= "</div>" +
                "</body>" +
                "</html>";

        html.loadData(texto,"text/html","utf-8");
    }
}