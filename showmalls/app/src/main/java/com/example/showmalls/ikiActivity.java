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

public class ikiActivity extends AppCompatActivity {
    GridView gridViewiki;
    String ikiisima[]={
            "Adidas", "Armani ", "Derimod", "Dockers ", "Flo", "Kanz ", "Levi's", "LC Waikiki ", "Nike", "Puma",
            "Altınyıldız Classics ", "Arzum", "D&R", "Koton" , "LTB", "Mavi" , "Teknosa" , "Vakko Outlet", "Cinetech",
            "Happy Center" , "Migros ", "Starbucks", "U.S. Polo Assn."
    };
    int ikiresima[]={R.drawable.adidas,R.drawable.armani,R.drawable.derimod,R.drawable.dockers,
            R.drawable.flo, R.drawable.kanz,R.drawable.levis,R.drawable.lcwaikiki,R.drawable.nike,
            R.drawable.puma, R.drawable.altinyildiz,R.drawable.arzum,R.drawable.dandr,R.drawable.koton,
            R.drawable.ltb, R.drawable.mavi,R.drawable.teknosa,R.drawable.vakko,R.drawable.cinetech,
            R.drawable.happycenter, R.drawable.migros,R.drawable.starbucks,R.drawable.uspoloassn
    };
    String ikikata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1",
            "Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1",
            "Kat:1","Kat:1"};
    String ikiphonea[] ={"0212 604 10 22",
            "0212 604 03 04", "0212 604 01 56", "0212 604 01 56", "0850 288 88 35", "0212 604 01 78", "0212 604 11 56",
            "0850 455 55 92", "0212 604 10 10", "0212 604 11 78", "0212 604 10 02", "0850 277 98 72", "0212 604 00 84",
            "0850 252 40 00", "0212 604 12 56", "0212 604 00 72", "0212 604 00 04", "0212 604 00 04", "0212 604 11 22",
            "0850 450 10 08", "0212 604 02 99", "0212 604 02 99", "0212 604 00 24", "0212 604 00 92", "0212 604 02 78"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iki);
        gridViewiki = findViewById(R.id.IkiGridview);

        ikidapter adapter=new ikidapter(this,ikiisima,ikiresima,ikikata,ikiphonea);
        gridViewiki.setAdapter(adapter);

    }
    class ikidapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        ikidapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.iki,R.id.ikiisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.iki,parent,false);
            ImageView resim=satir.findViewById(R.id.ikiresim);
            TextView benimbaslik=satir.findViewById(R.id.ikiisim);
            TextView benimkat=satir.findViewById(R.id.ikikat);
            TextView benimphone=satir.findViewById(R.id.ikiphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}