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

public class OptimumActivity extends AppCompatActivity {
    GridView gridViewop;
    String optimumisima[]={
            "Boyner Outlet",
            "Nike Factory Store ",
            "LC Waikiki",
            "Teknosa",
            "Marks & Spencer",
            "Koton" ,
            "Derimod",
            "Tommy Hilfiger" ,
            "Cinemaximum",
            "Burger King",
            "Starbucks",
            "Mado",

    };
    int optimumresima[]={R.drawable.boyner,R.drawable.nike,R.drawable.lcwaikiki,R.drawable.teknosa,
            R.drawable.marks, R.drawable.koton,R.drawable.derimod,R.drawable.tommy,R.drawable.cinemaxmum,
            R.drawable.burgerking,R.drawable.starbucks, R.drawable.mado
    };
    String optimumkata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String optimumphonea[] ={"0212 444 22 99",
            "0212 866 01 23",
            "0850 222 05 50",
            "0212 866 10 20",
            "0212 866 03 61",
            "0212 866 05 14",
            "0212 866 04 15",
            "0212 866 06 10",
            "0850 724 06 24",
            "0212 866 05 17",
            "0212 866 06 21",
            "0212 866 06 16"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optimum);
        gridViewop = findViewById(R.id.OptimumGridview);

        optimumadapter adapter=new optimumadapter(this,optimumisima,optimumresima,optimumkata,optimumphonea);
        gridViewop.setAdapter(adapter);

    }
    class optimumadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        optimumadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.optimum,R.id.optimumtisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.optimum,parent,false);
            ImageView resim=satir.findViewById(R.id.optimumresim);
            TextView benimbaslik=satir.findViewById(R.id.optimumtisim);
            TextView benimkat=satir.findViewById(R.id.optimumkat);
            TextView benimphone=satir.findViewById(R.id.optimumphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}