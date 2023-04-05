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

public class IstinyeActivity extends AppCompatActivity {
    GridView gridViewis;
    String istinyeisima[]={
            "Apple ","Bershka" ,"Boyner ","LC Waikiki" ,"Mango ","Massimo Dutti" ,"Sephora" ,"Zara" ,
            "Adidas" ,"Bvlgari" ,"Cartier", "Dior ","Fendi ","Gucci", "H&M ","Hacı Şakir ","İpekyol" ,
            "Lacoste" ,"Mavi Jeans", "Nike ","Oysho ","Puma ","Sisley" ,"The North Face ","Tommy Hilfiger" ,
            "Vakko ","Victoria's Secret ","Yargıcı ",

            "Beymen", "Cinemaximum" ,"Beymen Home", "Mudo ","Paşabahçe" ,"Teknosa ",
            "Jamie's Italian", "Nusr-Et Steakhouse" ,"Shake Shack ","Tile "

    };
    int istinyeresima[]={R.drawable.apple,R.drawable.bershka,R.drawable.boyner,R.drawable.lcwaikiki,
            R.drawable.mango, R.drawable.massimo,R.drawable.sephora,R.drawable.zara,R.drawable.adidas,
            R.drawable.bvlgari,R.drawable.cartier, R.drawable.dior,R.drawable.fendi,R.drawable.gucci,
            R.drawable.handm,R.drawable.hacisakir,R.drawable.ipekyol,R.drawable.lacoste,R.drawable.mavi,R.drawable.nike,
            R.drawable.oysho, R.drawable.puma,R.drawable.sisley,R.drawable.thenorthface,R.drawable.tommy,
            R.drawable.vakko,R.drawable.victoriasecret, R.drawable.yargici,R.drawable.beymenclub,R.drawable.cinemaxmum,
            R.drawable.beymenclub,R.drawable.mudo,R.drawable.pasabahce,R.drawable.teknosa,R.drawable.jamies,R.drawable.nusret,
            R.drawable.shakeshack,R.drawable.tile
    };
    String istinyekata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1", "Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1", "Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1", "Kat:1","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3","Kat:3","Kat:3","Kat:3"};
    String istinyephonea[] ={"0212 345 50 00","0212 345 51 51","0212 345 50 80","0212 345 50 50","0212 345 50 10","0212 345 50 55",
            "0212 345 51 00","0212 345 55 55","0212 345 51 60","0212 345 50 85","0212 345 50 90","0212 345 50 95",
            "0212 345 50 65","0212 345 50 70","0212 345 50 35","0212 345 51 01","0212 345 50 20","0212 345 50 75",
            "0212 345 50 15","0212 345 51 65","0212 345 50 45","0212 345 51 70","0212 345 50 60","0212 345 51 75",
            "0212 345 50 40","0212 345 50 05","0212 345 51 20","0212 345 50 25","0212 345 50 03","0212 345 50 28",
            "0212 345 50 05","0212 345 50 21","0212 345 50 26","0212 345 50 31","0212 345 51 55","0212 345 51 35",
            "0212 345 51 25","0212 345 51 40"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istinye);
        gridViewis = findViewById(R.id.IstinyeGridview);

        istinyeadapter adapter=new istinyeadapter(this,istinyeisima,istinyeresima,istinyekata,istinyephonea);
        gridViewis.setAdapter(adapter);

    }
    class istinyeadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        istinyeadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.istinye,R.id.istinyeisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.istinye,parent,false);
            ImageView resim=satir.findViewById(R.id.istinyeresim);
            TextView benimbaslik=satir.findViewById(R.id.istinyeisim);
            TextView benimkat=satir.findViewById(R.id.istinyetkat);
            TextView benimphone=satir.findViewById(R.id.istinyephone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}