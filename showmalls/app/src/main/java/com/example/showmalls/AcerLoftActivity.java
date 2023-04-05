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
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class AcerLoftActivity extends AppCompatActivity {
    GridView gridViewac;
String acerloftisima[]={"FunLoft", "MİGROS", "KOÇTAŞFİX ", "MADAME COCO", "VOLKSWAGEN", "ACAR CONCEPT & DESIGN", "EGO PARIS",
        "SIFAS", "NEZİH", "PETBOX", "SERAP ECZANESİ", "YAZZ", "WATSONS", "MOENA", "BAKLAVACI GÜLLÜOĞLU", "CARMEN GÜMÜŞ TAKI",
        "GÜNGENCİ SAAT", "LINEADECOR", "SMEG", "LEO CONCEPT", "MARIPOSA", "STARBUCKS", "SUSHICO", "PANİSTA",
        "THERA'S CAFE", "MARMARIS LOFT", "KRISPY KREME"};
int acerloftresima[]={R.drawable.funloft,R.drawable.migros,R.drawable.koctasfix,R.drawable.madamecoco,R.drawable.volskwagen,
R.drawable.acarconcept,R.drawable.egoparis,R.drawable.sifas,R.drawable.nezih,R.drawable.petbox,R.drawable.serapeczanesi,
R.drawable.yazz,R.drawable.watsons,R.drawable.moena,R.drawable.bgulluoglu,R.drawable.carmen,R.drawable.gurgenci,R.drawable.lineadecor,
R.drawable.smeg,R.drawable.leoconcept,R.drawable.mariposa,R.drawable.starbucks,R.drawable.sushico,R.drawable.panista,
R.drawable.theares,R.drawable.marmarisloft,R.drawable.krispykreme};
    String acerloftkata[]={"Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",};
    String acerloftphonea[] ={" 0216 680 7171", "0850 310 22 44", "0216 227 34 32", "0216 510 33 27", "0216 538 76 00",
            "0216 537 71 58", "-", "-", "0216 680 72 22", "0850 500 05 55 ", " 0216 331 47 38", "0216 425 81 61",
            " 0 216 680 71 01","0 216 680 70 22","0216 680 71 21", " 0 536 216 81 49", "0530 447 01 79 ", "0216 465 06 34",
            "0216 465 06 34 ", "0 216 680 70 71", "0543 448 37 21", " 0216 680 70 55", "0216 425 06 00",
            "0 539 777 54 10", "0546 275 82 65", "0216 680 99 53", "-"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acer_loft);
        gridViewac = findViewById(R.id.AcerLoftGridview);

        acerloftadapter adapter=new acerloftadapter(this,acerloftisima,acerloftresima,acerloftkata,acerloftphonea);
        gridViewac.setAdapter(adapter);

    }
    class acerloftadapter extends ArrayAdapter<String>{
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        acerloftadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.acerloft,R.id.acerloftisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.acerloft,parent,false);
            ImageView resim=satir.findViewById(R.id.acerloftresim);
            TextView benimbaslik=satir.findViewById(R.id.acerloftisim);
            TextView benimkat=satir.findViewById(R.id.acerloftkat);
            TextView benimphone=satir.findViewById(R.id.acerloftphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}