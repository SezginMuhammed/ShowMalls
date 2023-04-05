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

public class AxisActivity extends AppCompatActivity {
    GridView gridViewax;
    String axisisima[]={"Carrefoursa",
            "DRY Clean", "Gratis", "Jolly TOurs", "Mademe Coco", "Samsung",
            "Teknosa", "Watsons",
            "Atasun Optik", "Dagi", "Defacto", "Derimod", "Eczane", "Flo", "Greyder", "İGS",
            "LC Waikiki", "Penti", "Yves Rocher",
            "Colin's", "Elegance Optik", "Hummel", "Lescon", "Mavi", "Süvari Giyim",
            "Armağan Oyuncak", "E-Bebek", "Arby's", "ArdenFC", "Baydöner", "Burger King", "HD İskender",
            " Köfteci Ramiz", "Otantik Kumpir", "Özsüt", "Pidem", "Popeyes", "Sbarro", "StarBucks", "Tavuk Dünyası", "Usta Dönerci",
            "Cinemaximum", "MacFit",

    };
    int axisresima[]={R.drawable.carrefoursa,R.drawable.dryclean,R.drawable.gratis,R.drawable.jolly,R.drawable.madamecoco,
            R.drawable.samsung,R.drawable.teknosa,R.drawable.watsons,R.drawable.atasunoptik,R.drawable.dagi,
            R.drawable.defacto,R.drawable.derimod,R.drawable.eczane,R.drawable.flo,R.drawable.greyder,R.drawable.igs,R.drawable.lcwaikiki,
            R.drawable.penti,R.drawable.yves,R.drawable.colins,R.drawable.eleganceoptik,R.drawable.hummel,R.drawable.lesacon,
            R.drawable.mavi,R.drawable.suvari,R.drawable.armagan,
            R.drawable.ebebek,R.drawable.arbys,R.drawable.ardenfc,
            R.drawable.baydoner,R.drawable.burgerking,R.drawable.hdiskender,
            R.drawable.kofteciramiz,R.drawable.otantik,R.drawable.ozsut,
            R.drawable.pidem,R.drawable.popeyes,R.drawable.sbarro,
            R.drawable.starbucks,R.drawable.tavukdunyasi,R.drawable.ustadonerci,R.drawable.cinemaxmum,R.drawable.macfit};
    String axiskata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1",
    "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",
    "Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2",
    "Kat:3","Kat:3"};
    String axisphonea[] ={"02128013691", "-", "02127052600", "02125004377",
            "02128013293", "02124934235", "02123975646", "05350186271", "05337017362", "02127772733",
            "05498064728", "02128013545", "02127775574", "02127770931", "08504200447", "02127771158",
            "02128010135", "0212775682", "02128013484", "02128013284", "02127774758", "02127774804", "02127034003",
            "02128091709", "0212803204", "05384894596", "02128033834", "05523935011", "-", "05382775289",
            "-", "-", "-", "02122824465", "02128013303", "05389485980", "02124477227", "02127776236",
            "02128013238", "05382273379", "-", "-",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axis);
        gridViewax = findViewById(R.id.AxisGridview);

       axisadapter adapter=new axisadapter(this,axisisima,axisresima,axiskata,axisphonea);
        gridViewax.setAdapter(adapter);

    }
    class axisadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        axisadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.axis,R.id.axisisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.axis,parent,false);
            ImageView resim=satir.findViewById(R.id.axisresim);
            TextView benimbaslik=satir.findViewById(R.id.axisisim);
            TextView benimkat=satir.findViewById(R.id.axiskat);
            TextView benimphone=satir.findViewById(R.id.axisphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}