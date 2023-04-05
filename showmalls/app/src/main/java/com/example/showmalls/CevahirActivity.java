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

public class CevahirActivity extends AppCompatActivity {
    GridView gridViewce;
    String cevahirisima[]={
            "Zara ", "H&M ", "Mango ", "Nike ", "Marks & Spencer",
            "LC Waikiki ", "Adidas ", "DeFacto ", "Bershka ", "Pull & Bear", "Stradivarius ", "Koton ",
            "Teknosa ", "Mavi ", "Tommy Hilfiger ", "U.S. Polo Assn. ", "Dockers ", "Lacoste ", "Superstep ",
            "Hotiç ",
            "Ecco ",
            "Debenhams",
            "Beymen Club",
            "Network ",
            "Vakko ",
            "İpekyol ",
            "Koton ",
            "Twist ",
            "Cinemaximum "
    };
    int cevahirresima[]={R.drawable.zara,R.drawable.handm,R.drawable.mango,R.drawable.nike,
            R.drawable.marks, R.drawable.lcwaikiki,R.drawable.adidas,R.drawable.defacto,R.drawable.bershka,
            R.drawable.pullbear, R.drawable.stradivarius,R.drawable.koton,R.drawable.teknosa,R.drawable.mavi,
            R.drawable.tommy, R.drawable.uspoloassn,R.drawable.dockers,R.drawable.lacoste,R.drawable.superstar,
            R.drawable.hotic, R.drawable.ecco,R.drawable.debenhas,R.drawable.beymenclub,
            R.drawable.network,R.drawable.vakko,R.drawable.ipekyol,
            R.drawable.koton,R.drawable.twist,R.drawable.cinemaxmum
    };
    String cevahirkata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2",
            "Kat:2","Kat:2","Kat:2","Kat:3"};
    String cevahirphonea[] ={
            "0212 380 10 10",
            "0212 380 20 30",
            "0212 380 40 51",
            "0212 380 20 70",
            "0212 380 26 00",
            "0212 380 24 44",
            "0212 380 20 40",
            "0212 380 22 00",
            "0212 380 21 20",
            "0212 380 21 70",
            "0212 380 21 90",
            "0212 380 41 00",
            "0212 315 33 33",
            "0212 380 10 16",
            "0212 380 10 20",
            "0212 380 10 29",
            "0212 380 10 33",
            "0212 380 10 46",
            "0212 380 10 43",
            "0212 380 10 19",
            "0212 380 10 24",
            "0212 380 10 19",
            "0212 380 30 00",
            "0212 368 64 60",
            "0212 380 30 33",
            "0212 368 60 00",
            "0212 380 31 13",
            "0212 380 31 55",
            "0212 380 31 00",
            "0212 380 05 05",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cevahir);
        gridViewce= findViewById(R.id.CevahirGridview);

        cevahirapter adapter=new cevahirapter(this,cevahirisima,cevahirresima,cevahirkata,cevahirphonea);
        gridViewce.setAdapter(adapter);

    }
    class cevahirapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        cevahirapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.cevahir,R.id.cevahirisim,baslik);
            this.context=c;
            this.acerisimaa=baslik;
            this.acerresimaa=acerloftresim;
            this.acerkataa=acerlofkat;
            this.acerphoneaa=acerloftphone;




        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View satir = layoutInflater.inflate(R.layout.cevahir, parent, false);
            ImageView resim = satir.findViewById(R.id.cevahirresim);
            TextView benimbaslik = satir.findViewById(R.id.cevahirisim);
            TextView benimkat = satir.findViewById(R.id.cevahirkat);
            TextView benimphone = satir.findViewById(R.id.cevahirphone);


            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}