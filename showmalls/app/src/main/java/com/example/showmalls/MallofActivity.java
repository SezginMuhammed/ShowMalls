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

public class MallofActivity extends AppCompatActivity {
    GridView gridViewmall;
    String mallofisima[]={
            "Zara", "H&M", "Pull & Bear", "Bershka ","Mango ","LC Waikiki ","DeFacto" ,"Gratis ",
            "Watsons" ,"Sephora" ,"Marks & Spencer ","Starbucks ",
            "Nike" ,"Adidas ","Puma","Reebok ","Tommy Hilfiger ","Massimo Dutti" ,"L'Occitane" ,
            "Swarovski ","Pandora ",
            "Cinemaximum ","FunLab" ,"Game Park", "BKM Kitap ",
            "Sushico ","Wagamama ","Kısmet Mutfak", "Mado" ,"Fornello ","Dükkan Burger"

    };
    int mallofresima[]={R.drawable.zara,R.drawable.handm,R.drawable.pullbear,R.drawable.bershka,
            R.drawable.mango, R.drawable.sephora,R.drawable.marks,R.drawable.starbucks,R.drawable.nike,
            R.drawable.adidas,R.drawable.puma, R.drawable.reebok,R.drawable.tommy,R.drawable.massimo,
            R.drawable.loccitane,R.drawable.swarovski,R.drawable.pandora,
            R.drawable.cinemaxmum,R.drawable.funlab, R.drawable.gamepark,R.drawable.bkmkitap,R.drawable.sushico,
            R.drawable.kismetmutfak,R.drawable.mado, R.drawable.fornello,R.drawable.dukkanburger
    };
    String mallofkata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3" };
    String mallofphonea[] ={"0212 801 11 34","0212 801 11 36","0212 801 11 38","0212 801 11 42","0212 801 11 44",
            "0212 801 11 78","0212 801 11 80","0212 801 11 98","0212 801 11 96","0212 801 11 94",
            "0212 801 11 48","0212 801 11 88","0212 801 11 66","0212 801 11 68","0212 801 11 70",
            "0212 801 11 72","0212 801 12 70","0212 801 12 78","0212 801 12 80","0212 801 12 84",
            "0212 801 12 82","0212 801 12 40","0212 801 12 54","0212 801 12 58","0212 801 12 52","0212 801 12 10",
            "0212 801 12 12","0212 801 12 14","0212 801 12 16","0212 801 12 18","0212 801 12 20"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mallof);
        gridViewmall = findViewById(R.id.MallofGridview);

        mallofadapter adapter=new mallofadapter(this,mallofisima,mallofresima,mallofkata,mallofphonea);
        gridViewmall.setAdapter(adapter);

    }
    class mallofadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        mallofadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.mallof,R.id.mallofisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.mallof,parent,false);
            ImageView resim=satir.findViewById(R.id.mallofresim);
            TextView benimbaslik=satir.findViewById(R.id.mallofisim);
            TextView benimkat=satir.findViewById(R.id.mallofkat);
            TextView benimphone=satir.findViewById(R.id.mallofphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}