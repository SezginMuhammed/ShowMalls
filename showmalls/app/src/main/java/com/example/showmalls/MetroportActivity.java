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

public class MetroportActivity extends AppCompatActivity {
    GridView gridViewmep;
    String metroportisima[]={
            "CarrefourSA ",
            "H&M",
            "MediaMarkt ",
            "Teknosa",
            "LC Waikiki",
            "Mudo Concept",
            "Koton",
            "Starbucks" ,
            "Cinemaximum ",
            "Boyner",
            "Flo",
            "Defacto"
    };
    int metroportresima[]={R.drawable.carrefoursa,R.drawable.handm,R.drawable.mediamarkt,R.drawable.teknosa,
            R.drawable.lcwaikiki, R.drawable.mudo,R.drawable.koton,R.drawable.starbucks,R.drawable.cinemaxmum,
            R.drawable.boyner,R.drawable.flo, R.drawable.defacto
    };
    String metroportkata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String metroportphonea[] ={"0850 222 20 00",
            "0850 222 05 06",
            "0212 454 74 44",
            "0850 222 55 99",
            "0850 222 05 50",
            "0212 444 68 36",
            "0212 551 97 40",
            "0212 659 48 72",
            "0212 455 25 51",
            "0850 266 96 37",
            "0850 266 35 35",
            "0850 333 32 28"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metroport);
        gridViewmep = findViewById(R.id.MetroportGridview);

        metroportadapter adapter=new metroportadapter(this,metroportisima,metroportresima,metroportkata,metroportphonea);
        gridViewmep.setAdapter(adapter);

    }
    class metroportadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        metroportadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.metroport,R.id.metroportisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.metroport,parent,false);
            ImageView resim=satir.findViewById(R.id.metroportresim);
            TextView benimbaslik=satir.findViewById(R.id.metroportisim);
            TextView benimkat=satir.findViewById(R.id.metroportkat);
            TextView benimphone=satir.findViewById(R.id.metroportphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}