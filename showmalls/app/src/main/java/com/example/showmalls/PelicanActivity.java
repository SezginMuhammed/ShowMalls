package com.example.showmalls;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class PelicanActivity extends AppCompatActivity {
    GridView gridViewpeli;
    String pelicanisima[]={
            "Boyner",
            "Mavi",
            "Teknosa",
            "Starbucks",
            "LC Waikiki",
            "Koton",
            "Nike Factory Store",
            "Burger King",
            "Cinemaximum ",
            "Flo ",
            "Teknosa Extra",
            "The Body Shop"

    };
    int pelicanresima[]={R.drawable.boyner,R.drawable.mavi,R.drawable.teknosa,R.drawable.starbucks,
            R.drawable.lcwaikiki, R.drawable.koton,R.drawable.nike,R.drawable.burgerking,R.drawable.cinemaxmum,
            R.drawable.flo,R.drawable.teknosa, R.drawable.thebody
    };
    String pelicankata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String pelicanphonea[] ={"0212 413 74 00",
            "0212 413 60 50",
            "0850 222 55 99",
            "0212 413 79 49",
            "0850 222 05 50",
            "0212 413 60 00",
            "0212 413 73 70",
            "0212 413 73 80",
            "0212 413 33 33",
            "0850 266 35 35",
            "0850 266 66 67",
            "0212 413 77 18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelican);
        gridViewpeli = findViewById(R.id.PelicanGridview);

        pelicanadapter adapter=new pelicanadapter(this,pelicanisima,pelicanresima,pelicankata,pelicanphonea);
        gridViewpeli.setAdapter(adapter);

    }
    class pelicanadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        pelicanadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.pelican,R.id.pelicanisim,baslik);
            this.context=c;
            this.acerisimaa=baslik;
            this.acerresimaa=acerloftresim;
            this.acerkataa=acerlofkat;
            this.acerphoneaa=acerloftphone;




        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View satir=layoutInflater.inflate(R.layout.pelican,parent,false);
            ImageView resim=satir.findViewById(R.id.pelicanresim);
            TextView benimbaslik=satir.findViewById(R.id.pelicanisim);
            TextView benimkat=satir.findViewById(R.id.pelicankat);
            TextView benimphone=satir.findViewById(R.id.pelicanphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}