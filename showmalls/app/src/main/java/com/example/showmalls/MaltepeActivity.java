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

public class MaltepeActivity extends AppCompatActivity {
    GridView gridViewmt;
    String maltepeisima[]={

            "LC Waikiki ","Koton ","Mavi Jeans" ,"DeFacto ","D&R ","Gratis" ,
            "Teknosa", "Watsons ","Mudo ","Simit Sarayı", "Tchibo ","Limonata" ,
            "Boyner ","Network", "Yargıcı", "Fabrika ","Koton Kids ","Koton Accessories ",
            "Koton Home", "Koton Baby", "Koton Shoes", "Derimod ","Greyder" ,"İnci Deri ","Dockers "

    };
    int malteperesima[]={R.drawable.lcwaikiki,R.drawable.koton,R.drawable.mavi,R.drawable.defacto,
            R.drawable.dandr, R.drawable.gratis,R.drawable.teknosa,R.drawable.watsons,R.drawable.mudo,
            R.drawable.simitsarayi,R.drawable.tchibo, R.drawable.limonata,R.drawable.boyner,R.drawable.network,
            R.drawable.yargici,R.drawable.fabrika,
            R.drawable.koton,R.drawable.koton, R.drawable.koton,R.drawable.koton,R.drawable.koton,
            R.drawable.derimod,R.drawable.greyder,
            R.drawable.incideri,R.drawable.dockers
    };
    String maltepekata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",};
    String maltepephonea[] ={"0216 370 03 05","0216 373 69 64","0216 373 78 34","0216 373 69 68",
            "0216 373 63 40","0850 210 08 47","0850 222 55 99","0216 370 03 03",
            "0216 373 77 44","0850 288 88 88","0216 370 03 11","0535 712 13 09",
            "0216 370 03 45","0216 290 93 93","0216 373 68 70","0216 373 77 70",
            "0216 373 68 25","0216 373 68 25","0216 373 68 25","0216 373 68 25",
            "0216 373 68 25","0216 373 69 02","0216 373 69 02","0216 373 69 02",
            "0216 373 69 02"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maltepe);
        gridViewmt = findViewById(R.id.MaltepeGridview);

        maltepeadapter adapter=new maltepeadapter(this,maltepeisima,malteperesima,maltepekata,maltepephonea);
        gridViewmt.setAdapter(adapter);

    }
    class maltepeadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        maltepeadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.maltepe,R.id.maltepeisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.maltepe,parent,false);
            ImageView resim=satir.findViewById(R.id.malteperesim);
            TextView benimbaslik=satir.findViewById(R.id.maltepeisim);
            TextView benimkat=satir.findViewById(R.id.maltepekat);
            TextView benimphone=satir.findViewById(R.id.maltepephone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}