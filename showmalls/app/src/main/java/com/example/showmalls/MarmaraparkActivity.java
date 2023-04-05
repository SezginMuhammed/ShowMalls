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

public class MarmaraparkActivity extends AppCompatActivity {
    GridView gridViewmp;
    String mparkisima[]={
            "Mudo Concept", "Koton", "Watsons ", "Boyner" , "LC Waikiki ", "Yves Rocher",
            "Gratis ", "Zara", "Cinemaximum", "Flo", "Teknosa ", "Adidas"

    };
    int mparkresima[]={R.drawable.mudo,R.drawable.koton,R.drawable.watsons,R.drawable.boyner,
            R.drawable.lcwaikiki, R.drawable.yves,R.drawable.gratis,R.drawable.zara,R.drawable.cinemaxmum,
            R.drawable.flo,R.drawable.teknosa,R.drawable.adidas
    };
    String mparkkata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String mparkphonea[] ={"0212 855 05 20", "0212 853 11 10", "0212 853 05 85",
            "0850 266 96 37", "0850 222 05 50", "0212 853 15 04", "0850 222 88 77",
            "0212 853 23 43", "0212 853 03 10", "0850 266 35 35", "0850 222 55 99",
            "0212 853 12 61"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marmarapark);
        gridViewmp= findViewById(R.id.MarmaraparkGridview);

        mparkdapter adapter=new mparkdapter(this,mparkisima,mparkresima,mparkkata,mparkphonea);
        gridViewmp.setAdapter(adapter);

    }
    class mparkdapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        mparkdapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.marmarapark,R.id.marmaraparkisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.marmarapark,parent,false);
            ImageView resim=satir.findViewById(R.id.marmaraparkresim);
            TextView benimbaslik=satir.findViewById(R.id.marmaraparkisim);
            TextView benimkat=satir.findViewById(R.id.marmaraparkkat);
            TextView benimphone=satir.findViewById(R.id.marmaraparkphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}