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

public class CapitolActivity extends AppCompatActivity {
    GridView gridViewcap;
    String capitolisima[]={
            "CarrefourSA","Deichmann ","Teknosa ","Yves Rocher", "The Body Shop",
            "LC Waikiki ","Flo ","Mavi ","Koton ","Defacto ",
            "Adidas", "US Polo Assn", "Nike ","Oysho ","Mudo City",
            "Cinemaximum",

};
    int capitolresima[]={R.drawable.carrefoursa,R.drawable.deichman,R.drawable.teknosa,R.drawable.yves,
            R.drawable.thebody, R.drawable.lcwaikiki,R.drawable.flo,R.drawable.mavi,R.drawable.koton,
            R.drawable.defacto,R.drawable.adidas, R.drawable.uspoloassn,R.drawable.nike,R.drawable.oysho,
            R.drawable.mudo,R.drawable.cinemaxmum
         };
    String capitolkata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3"};
    String capitolphonea[] ={"0216 625 35 00","0216 625 34 13","0216 625 35 70","0216 625 34 17",
            "0216 625 34 12","0216 625 34 46","0216 625 34 30","0216 625 34 54",
            "0216 625 34 42","0216 625 34 22","0216 625 34 60","0216 625 34 66",
            "0216 625 34 63","0216 625 34 68","0216 625 34 74","0216 625 34 90",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitol);
        gridViewcap = findViewById(R.id.CapitolGridview);

        capitoladapter adapter=new capitoladapter(this,capitolisima,capitolresima,capitolkata,capitolphonea);
        gridViewcap.setAdapter(adapter);

    }
    class capitoladapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        capitoladapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.capitol,R.id.capitolisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.capitol,parent,false);
            ImageView resim=satir.findViewById(R.id.capitolresim);
            TextView benimbaslik=satir.findViewById(R.id.capitolisim);
            TextView benimkat=satir.findViewById(R.id.capitoltkat);
            TextView benimphone=satir.findViewById(R.id.capitolphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}