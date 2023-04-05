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

public class KozzyActivity extends AppCompatActivity {
    GridView gridViewkoz;
    String kozzyisima[]={
            "Adidas ", "Akbank ", "Arçelik" , "Burger King " , "C&A ", "Domino's Pizza" ,
            "English Home ", "Flo", "H&M ", "İnci Deri ", "Mavi ", "Media Markt", "Mudo City",
            "Sbarro ", "Starbucks" , "Şok Market", "Yves Rocher ", "D&R" , "Avva ",
            "KFC ", "LC Waikiki " , "Penti ", "Colin's", "Caffe Nero ", "DeFacto ",
            "E-bebek ", "İpekyol ", "Teknosa ", "Toyzz Shop" , "Cinebonus"


    };
    int kozzyresima[]={R.drawable.adidas,R.drawable.akbank,R.drawable.arcelik,R.drawable.burgerking,
            R.drawable.canda, R.drawable.dominos,R.drawable.englishhome,R.drawable.flo,R.drawable.handm,
            R.drawable.incideri, R.drawable.mavi,R.drawable.mediamarkt,R.drawable.mudo,R.drawable.sbarro,
            R.drawable.starbucks, R.drawable.sok,R.drawable.yves,R.drawable.dandr,R.drawable.avva,
            R.drawable.kfc, R.drawable.lcwaikiki,R.drawable.penti,R.drawable.colins,
            R.drawable.caffenero,R.drawable.defacto,R.drawable.ebebek,R.drawable.ipekyol,
            R.drawable.teknosa, R.drawable.toyzz,R.drawable.cinemaxmum
    };
    String kozzykata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1",
            "Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3"};
    String kozzyphonea[] ={
            " 0 (216) 681 71 06", "0 (216) 706 08 25", " 0 (850) 210 80 20", " 0 (216) 706 28 72", " 0 (216) 606 00 15", " 0 (216) 706 08 00",
            " 0 (216) 706 08 03", " 0 (216) 706 08 07", " 0 (216) 706 08 02", " 0 (850) 252 44 66", " 0 (216) 706 08 14",
            " 0(216) 706 08 05", " 0 (850) 222 11 00", " 0 (216) 706 08 10", " 0 (216) 706 08 12", " 0 (216) 706 08 13",
            " 0 (216) 706 08 11", " 0 (216) 706 08 09", " 0 (216) 465 06 60", " 0 (216) 465 28 84", " 0 (216) 706 08 15",
            " 0 (216) 706 08 32", " 0 (216) 706 08 27", " 0 (216) 706 08 35", " 0 (216) 706 08 29", " 0 (216) 706 08 31",
            " 0 (216) 706 08 23", " 0 (216) 706 08 34", " 0 (850) 222 55 55", " 0 (216) 706 08 17", " 0 (216) 325 03 25"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozzy);
        gridViewkoz = findViewById(R.id.KozzyGridview);

        kozzydapter adapter=new kozzydapter(this,kozzyisima,kozzyresima,kozzykata,kozzyphonea);
        gridViewkoz.setAdapter(adapter);

    }
    class kozzydapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        kozzydapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.kozzy,R.id.kozzyisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.kozzy,parent,false);
            ImageView resim=satir.findViewById(R.id.kozzyresim);
            TextView benimbaslik=satir.findViewById(R.id.kozzyisim);
            TextView benimkat=satir.findViewById(R.id.kozzykat);
            TextView benimphone=satir.findViewById(R.id.kozzyphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}