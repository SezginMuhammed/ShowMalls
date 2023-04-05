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

public class ForumActivity extends AppCompatActivity {
    GridView gridViewfo;
    String forumisima[]={
            "Boyner ","Decathlon ","H&M ","LC Waikiki ","Mango ","Marks & Spencer" ,
            "Starbucks" ,"Teknosa", "Zara" ,
            "Burger King", "DeFacto ","Gamecenter", "Koton ",
            "Mudo" ,"Vakko" ,
            "Beymen ","Flo ","Hotiç" ,"İpekyol ","Nike ",
            "Cinemaximum ",
            "Adore ","Koton Kids "
    };
    int forumresima[]={R.drawable.boyner,R.drawable.decathlon,R.drawable.handm,R.drawable.lcwaikiki,
            R.drawable.mango, R.drawable.marks,R.drawable.starbucks,R.drawable.teknosa,R.drawable.zara,
            R.drawable.burgerking,R.drawable.defacto, R.drawable.gamecenter,R.drawable.koton,R.drawable.mudo,
            R.drawable.vakko,R.drawable.beymenclub,R.drawable.flo,R.drawable.hotic,
            R.drawable.ipekyol,R.drawable.nike,R.drawable.cinemaxmum,R.drawable.adore,R.drawable.koton
    };
    String forumkata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3","kat:4","Kat:4"};
    String forumphonea[] ={"0212 354 06 00","0212 354 03 00","0850 288 10 66","0212 354 06 02","0212 354 03 15",
            "0212 354 03 50","0212 354 06 77","0212 354 05 00","0212 354 03 30","0212 354 06 70",
            "0212 354 03 25","0212 354 06 20","0212 354 06 03","0212 354 06 06","0212 354 03 80","0212 354 03 65",
            "0212 354 03 40","0212 354 03 75","0212 354 03 55","0212 354 06 90","0212 354 06 08","0212 354 04 02",
            "0212 354 06 04"
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        gridViewfo = findViewById(R.id.ForumGridview);

        forumadapter adapter=new forumadapter(this,forumisima,forumresima,forumkata,forumphonea);
        gridViewfo.setAdapter(adapter);

    }
    class forumadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        forumadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.forum,R.id.forumisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.forum,parent,false);
            ImageView resim=satir.findViewById(R.id.forumresim);
            TextView benimbaslik=satir.findViewById(R.id.forumisim);
            TextView benimkat=satir.findViewById(R.id.forumkat);
            TextView benimphone=satir.findViewById(R.id.forumphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}