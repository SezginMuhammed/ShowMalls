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

public class ZorluActivity extends AppCompatActivity {
    GridView gridViewzor;
    String zorluisima[]={
            "Adidas" ,
            "Apple",
            "H&M",
            "İpekyol",
            "Koton",
            "Mango",
            "Nike ",
            "Sephora ",
            "Boyner",
            "Beymen ",
            "Zara",
            "Massimo Dutti",
            "Tommy Hilfiger",
            "Vakko ",
            "Cinemaximum",
            "D&R ",
            "Nespresso",
            "Starbucks ",
            "Ümitköy Migros"
    };
    int zorluresima[]={R.drawable.adidas,R.drawable.apple,R.drawable.handm,R.drawable.ipekyol,
            R.drawable.koton, R.drawable.mango,R.drawable.nike,R.drawable.sephora,R.drawable.boyner,
            R.drawable.zara, R.drawable.massimo,R.drawable.vakko,R.drawable.cinemaxmum,R.drawable.dandr,
            R.drawable.nespresso,R.drawable.starbucks, R.drawable.migros
    };
    String zorlukata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String zorluphonea[] ={"0212 353 59 95",
            "0216 282 15 00",
            "0850 252 40 00",
            "0212 353 69 00",
            "0212 353 89 09",
            "0850 288 10 10",
            "0212 353 50 50",
            "0850 222 0 737",
            "0850 222 00 00",
            "0212 708 34 50",
            "0212 373 44 20",
            "0212 353 06 25",
            "0212 708 35 15",
            "0212 353 80 00",
            "0212 924 01 66",
            "0212 353 68 50",
            "0212 924 01 88",
            "0212 353 78 02",
            "0212 924 08 40"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zorlu);
        gridViewzor = findViewById(R.id.ZorluGridview);

        zorluadapter adapter=new zorluadapter(this,zorluisima,zorluresima,zorlukata,zorluphonea);
        gridViewzor.setAdapter(adapter);

    }
    class zorluadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        zorluadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.zorlu,R.id.zorluisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.zorlu,parent,false);
            ImageView resim=satir.findViewById(R.id.zorluresim);
            TextView benimbaslik=satir.findViewById(R.id.zorluisim);
            TextView benimkat=satir.findViewById(R.id.zorlukat);
            TextView benimphone=satir.findViewById(R.id.zorluphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}