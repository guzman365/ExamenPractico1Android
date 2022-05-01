package com.example.examenpractico1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;//primero importar clase
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    String[] titulos;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context context,String[] titulo,int[] imagenes){
        this.context=context;
        this.titulos=titulo;
        this.imagenes=imagenes;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView txt; //Representa titutlos
        ImageView img; //Representa las imagenes

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //asociar xml de donde traigo la estructura y como se quiere que vayan los items
        View itenView = inflater.inflate(R.layout.activity_lista, parent, false);  // se crea xml llamado activity_lista para simular el listado de imagenes y texto

        txt = itenView.findViewById(R.id.textView); //asocia el titulo segun orden
        img = itenView.findViewById(R.id.imageView);  //asocia la imagen segun orden

        txt.setText(titulos[position]);
        img.setImageResource(imagenes[position]);

        return itenView;
    }
}
