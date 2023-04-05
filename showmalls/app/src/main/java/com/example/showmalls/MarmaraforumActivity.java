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

public class MarmaraforumActivity extends AppCompatActivity {
    GridView gridViewmf;
    String mforumisima[]={
            "Adidas",
            "Bershka ",
            "Boyner ",
            "H&M",
            "LC Waikiki ",
            "Migros",
            "Starbucks",
            "Cinemaximum",
            "GameZone",
            "Teknosa "
    };
    int mforumresima[]={R.drawable.adidas,R.drawable.bershka,R.drawable.boyner,R.drawable.handm,
            R.drawable.lcwaikiki, R.drawable.migros,R.drawable.starbucks,R.drawable.cinemaxmum,R.drawable.gamezone,
            R.drawable.teknosa    };
    String mforumkata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1",};
    String mforumphonea[] ={"0212 465 54 60",
            "0850 222 06 67",
            "0850 266 96 37",
            "0850 222 05 06",
            "0850 222 05 50",
            "0212 465 40 00",
            "0212 465 44 08",
            "0212 468 42 28",
            "0212 465 54 80",
            "0850 222 55 99"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marmaraforum);
        gridViewmf= findViewById(R.id.MarmaraforumGridview);

        marmaraforumadapter adapter=new marmaraforumadapter(this,mforumisima,mforumresima,mforumkata,mforumphonea);
        gridViewmf.setAdapter(adapter);

    }
    class marmaraforumadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        marmaraforumadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.marmaraforum,R.id.marmaraforumisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.marmaraforum,parent,false);
            ImageView resim=satir.findViewById(R.id.marmaraforumphone);
            TextView benimbaslik=satir.findViewById(R.id.marmaraforumisim);
            TextView benimkat=satir.findViewById(R.id.marmaraforumkat);
            TextView benimphone=satir.findViewById(R.id.marmaraforumphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}