package com.example.examenpractico1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class infoPais extends AppCompatActivity {
    WebView html;
    String texto;
    Button btnRegresarPais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pais);

        btnRegresarPais = findViewById(R.id.btnRegresarPais);

        btnRegresarPais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(infoPais.this, transicion.class);
                startActivity(act2);
            }
        });

        html = findViewById(R.id.webView2);
        texto = "<html>" +
                "<body>";
        texto+= "<div style='border-radius: 25px; border-style:solid; padding: 10px;border-width: 2px'>";
        texto+= "<h3>INFORMACION GENERAL</h3><br>"+
                "Los Estados Unidos es el tercer país más grande del mundo en cuanto a su población y el cuarto más grande en superficie. Está compuesto por 50 estados cuya capital es Washington distrito federal, D.F. En la corta historia desde su fundación hace 200 años, los Estados Unidos han alcanzado un desarrollo notable en muchas áreas. El país es uno de los más avanzados en los campos de la economía, la ciencia, la tecnología de información, la medicina, la política, y el ocio. Quizás los avances producidos en el campo de ocio, ha contribuido a que los Estados Unidos sea el destino más elegido por los estudiantes extranjeros a la hora de realizar sus estudios. ";
        texto+= "<br>Los Estados Unidos fue uno de los primeros países en dar la bienvenida a un número importante de estudiantes internacionales, a sus institutos y universidades. Después de la 2ª GUERRA MUNDIAL, EEUU abrió sus escuelas a aquellos estudiantes que provenían principalmente de las áreas devastadas por guerra en Europa. Los estudiantes del Oriente Medio y Asia les siguieron a continuación . En la actualidad, EEUU recibe más de 500,000 estudiantes internacionales en muchas sus universidades.";
        texto+= "</div>" +
                "</body>" +
                "</html>";

        html.loadData(texto,"text/html","utf-8");
    }
}