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

public class StarcityActivity extends AppCompatActivity {
    GridView gridViewst;
    String starcityisima[]={

            "Defacto",
            "Koton",
            "Teknosa" ,
            "Nike Factory Store ",
            "LC Waikiki ",
            "D&R",
            "Burger King",
            "Us Polo",
            "Cinemaximum",
            "Starbucks",
            "YKM",
            "Adidas Outlet "

    };
    int starcityresima[]={R.drawable.defacto,R.drawable.koton,R.drawable.teknosa,R.drawable.nike,
            R.drawable.lcwaikiki, R.drawable.dandr,R.drawable.burgerking,R.drawable.uspoloassn,R.drawable.cinemaxmum,
            R.drawable.starbucks,R.drawable.ykm, R.drawable.adidas
    };
    String starcitykata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String starcityphonea[] ={"0212 485 85 90",
            "0212 485 79 88",
            "0850 222 55 99",
            "0212 485 70 22",
            "0850 222 05 50",
            "0212 485 75 50",
            "0212 485 75 72",
            "0212 485 73 35",
            "0850 755 55 55",
            "0212 485 79 84",
            "0850 222 55 99",
            "0212 485 70 20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starcity);
        gridViewst = findViewById(R.id.StarcityGridview);

        starcityadapter adapter=new starcityadapter(this,starcityisima,starcityresima,starcitykata,starcityphonea);
        gridViewst.setAdapter(adapter);

    }
    class starcityadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        starcityadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.starcity,R.id.starcityisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.starcity,parent,false);
            ImageView resim=satir.findViewById(R.id.starcityresim);
            TextView benimbaslik=satir.findViewById(R.id.starcityisim);
            TextView benimkat=satir.findViewById(R.id.starcitykat);
            TextView benimphone=satir.findViewById(R.id.starcityphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}