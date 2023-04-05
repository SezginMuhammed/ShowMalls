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

public class ToriumActivity extends AppCompatActivity {
    GridView gridViewtor;
    String toriumisima[]={

            "Koton",
            "DeFacto",
            "Teknosa",
            "Vakko Outlet",
            "LC Waikiki" ,
            "Burger King" ,
            "Nike Factory Store ",
            "İpekyol",
            "Cinemaximum",
            "Mudo Outlet" ,
            "Adidas Outlet",
            "Starbucks "



    };
    int toriumresima[]={R.drawable.koton,R.drawable.defacto,R.drawable.teknosa,R.drawable.vakko,
            R.drawable.lcwaikiki, R.drawable.burgerking,R.drawable.nike,R.drawable.ipekyol,R.drawable.cinemaxmum,
            R.drawable.mudo,R.drawable.adidas, R.drawable.starbucks
    };
    String toriumkata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String toriumphonea[] ={"0212 866 39 98",
            "0850 333 32 28",
            "0212 866 39 39",
            "0212 866 39 29",
            "0850 222 05 50",
            "0212 866 39 06",
            "0212 866 39 05",
            "0212 866 39 36",
            "0850 744 04 44",
            "0212 866 39 01",
            "0212 866 39 08",
            "0212 866 39 14"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torium);
        gridViewtor = findViewById(R.id.ToriumGridview);

        toriumadapter adapter=new toriumadapter(this,toriumisima,toriumresima,toriumkata,toriumphonea);
        gridViewtor.setAdapter(adapter);

    }
    class toriumadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        toriumadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.torium,R.id.toriumisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.torium,parent,false);
            ImageView resim=satir.findViewById(R.id.toriumresim);
            TextView benimbaslik=satir.findViewById(R.id.toriumisim);
            TextView benimkat=satir.findViewById(R.id.toriumkat);
            TextView benimphone=satir.findViewById(R.id.toriumphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}