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

public class KanyonActivity extends AppCompatActivity {
    GridView gridViewkan;
    String kanyonisima[]={
            "Adidas ", "Beymen Blender ", "Boyner ", "Derimod ", "Douglas", "Flo ",
            "Gap ", "Kanyon Pharmacy" , "Kiehl's ", "Koton ", "Mango ", "Mavi Jeans ",
            "Nike" , "Sephora ", "Swatch" , "Victoria's Secret ", "Yargıcı", "Zara ",
            "Altınyıldız Classics ", "Armani Exchange" , "Bershka ", "Beymen Club" , "Diesel" ,
            "Ipekyol ", "Jack&Jones" , "Koton Kids ", "Lacoste ", "LC Waikiki ",
            "Mavi Jeans", "Network" , "Oysho ", "Polo Ralph Lauren ", "Pull&Bear ", "Roman ",
            "Sisley" , "Stradivarius", "Tommy Hilfiger", "US Polo Assn. ", "Adidas Originals",
            "Apple Store ",
            "Burberry ",
            "Calvin Klein Jeans ",
            "Converse ",
            "Emporio Armani ",
            "Fenerium ",
            "Gizia" ,
            "Guess ",
            "Massimo Dutti"
    };
    int kanyonresima[]={R.drawable.adidas,R.drawable.beymenclub,R.drawable.boyner,R.drawable.derimod,
            R.drawable.douglas, R.drawable.flo,R.drawable.gap,R.drawable.pharmacy,R.drawable.kiehls,
            R.drawable.koton, R.drawable.mango,R.drawable.mavi,R.drawable.nike,R.drawable.sephora,
            R.drawable.swatch, R.drawable.victoriasecret,R.drawable.yargici,R.drawable.zara,R.drawable.altinyildiz,
            R.drawable.armani, R.drawable.bershka,R.drawable.beymenclub,R.drawable.diesel,
            R.drawable.ipekyol,R.drawable.jackjones,R.drawable.koton,R.drawable.lacoste,
            R.drawable.lcwaikiki, R.drawable.mavi,R.drawable.network,R.drawable.oysho,R.drawable.uspoloassn,
            R.drawable.adidas, R.drawable.apple,R.drawable.burbery,R.drawable.calvin,R.drawable.converse,
            R.drawable.armani, R.drawable.fenerium,R.drawable.gizia,R.drawable.guess ,R.drawable.massimo,
    };
    String kanyonkata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2"};
    String kanyonphonea[] ={
            "0212 353 67 04", "0212 353 06 60", "0212 353 53 53", "0212 353 56 90", "0212 353 63 91", "0212 353 77 85",
            "0212 353 05 55", "0212 353 50 05", "0212 353 58 81", "0212 353 05 58",
            "0212 353 54 50", "0212 353 56 18", "0212 353 62 18", "0212 353 65 04",
            "0212 353 52 30", "0212 353 57 14", "0212 353 62 40", "0212 353 54 05",
            "0212 353 50 43", "0212 353 53 43", "0212 353 07 05", "0212 353 05 33", "0212 353 06 60",
            "0212 353 67 64", "0212 353 53 25", "0212 353 67 11", "0212 353 05 58", "0212 353 56 36", "0212 353 50 57",
            "0212 353 62 18", "0212 353 50 76", "0212 353 54 54", "0212 353 66 18", "0212 353 05 35", "0212 353 56 52",
            "0212 353 65 80", "0212 353 05 37", "0212 353 64 10", "0212 353 64 05",
            "0212 353 67 04", "0212 353 51 00", "0212 353 61 01", "0212 353 65 24", "0212 353 65 13",
            "0212 353 07 05", "0212 353 57 70", "0212 353 54 95", "0212 353 55 75", "0212 353 60 36"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanyon);
        gridViewkan = findViewById(R.id.KanyonGridview);

        kanyondapter adapter=new kanyondapter(this,kanyonisima,kanyonresima,kanyonkata,kanyonphonea);
        gridViewkan.setAdapter(adapter);

    }
    class kanyondapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        kanyondapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.kanyon,R.id.kanyonisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.kanyon,parent,false);
            ImageView resim=satir.findViewById(R.id.kanyonresim);
            TextView benimbaslik=satir.findViewById(R.id.kanyonisim);
            TextView benimkat=satir.findViewById(R.id.kanyonkat);
            TextView benimphone=satir.findViewById(R.id.kanyonphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}