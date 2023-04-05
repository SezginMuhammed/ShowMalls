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

public class HistoriaActivity extends AppCompatActivity {
    GridView gridViewhi;
    String historiaisima[]={
            "Burger King","Mavi Jeans ","Starbucks" ,"Teknosa ",
            "Adidas", "Bambi ","DeFacto ","Derimod ","Flo","Koton" ,"LC Waikiki ","Network ","Penti" ,
            "Boyner ","Colin's", "D&R ","English Home", "Koton Kids", "Nike ","Pierre Cardin ",
            "Cinemaximum"


};
    int historiaresima[]={R.drawable.burgerking,R.drawable.mavi,R.drawable.starbucks,R.drawable.teknosa,
            R.drawable.adidas, R.drawable.bambi,R.drawable.defacto,R.drawable.derimod,R.drawable.flo,
            R.drawable.koton,R.drawable.lcwaikiki, R.drawable.network,R.drawable.penti,R.drawable.boyner,
            R.drawable.colins,R.drawable.dandr,R.drawable.englishhome,
            R.drawable.koton,R.drawable.nike,R.drawable.pierrecardin,
            R.drawable.cinemaxmum
    };
    String historiakata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3"};
    String historiaphonea[] ={"0212 481 70 72",
            "0212 481 70 57","0212 481 70 69","0212 481 70 60","0212 481 70 58","0212 481 70 59","0212 481 70 61",
            "0212 481 70 62","0212 481 70 63","0212 481 70 65","0212 481 70 64","0212 481 70 66","0212 481 70 67",
            "0212 481 70 73",
            "0212 481 70 75",
            "0212 481 70 76",
            "0212 481 70 77",
            "0212 481 70 78",
            "0212 481 70 79",
            "0212 481 70 80",
            "0212 481 70 74"
            };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        gridViewhi = findViewById(R.id.HistoriaGridview);

        historiaadapter adapter=new historiaadapter(this,historiaisima,historiaresima,historiakata,historiaphonea);
        gridViewhi.setAdapter(adapter);

    }
    class historiaadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        historiaadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.historia,R.id.historiaisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.historia,parent,false);
            ImageView resim=satir.findViewById(R.id.historiaresim);
            TextView benimbaslik=satir.findViewById(R.id.historiaisim);
            TextView benimkat=satir.findViewById(R.id.historiakat);
            TextView benimphone=satir.findViewById(R.id.historiaphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}