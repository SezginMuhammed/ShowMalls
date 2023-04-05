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

public class CapacityActivity extends AppCompatActivity {
    GridView gridViewca;
    String capacityisima[]={
            "CarrefourSA","LC Waikiki ","Flo ","Yataş ","Teknosa ",
            "DeFacto ","Koton ","Watsons ",
            "Adidas", "US Polo Assn", "Nike ","Derimod", "Skechers ","LC Waikiki Kids",
            "LC Waikiki Man", "LC Waikiki Woman", "Oysho ","Stradivarius", "Pull & Bear ","Bershka ",
            "Cinemaximum"

    };
    int capacityresima[]={R.drawable.carrefoursa,R.drawable.lcwaikiki,R.drawable.flo,R.drawable.yatas,
            R.drawable.teknosa, R.drawable.defacto,R.drawable.koton,R.drawable.watsons,R.drawable.adidas,
            R.drawable.uspoloassn,R.drawable.nike, R.drawable.derimod,R.drawable.skechers,R.drawable.lcwaikiki,
            R.drawable.lcwaikiki,R.drawable.lcwaikiki,R.drawable.oysho,R.drawable.stradivarius, R.drawable.pullbear,
            R.drawable.bershka,R.drawable.cinemaxmum};
    String capacitykata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2","Kat:3",};
    String capacityaphonea[] ={"0216 578 50 00","0216 538 58 58","0216 578 50 05","0216 578 50 20",
            "0216 578 50 10","0216 578 50 31","0216 538 55 55","0216 578 50 32",
            "0216 578 50 60","0216 578 50 58","0216 538 53 20","0216 578 50 73",
            "0216 538 53 60","0216 538 58 58","0216 538 58 58","0216 538 58 58",
            "0216 538 56 00","0216 538 54 50","0216 538 54 30","0216 538 54 10",
            "0216 538 50 50"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacity);
        gridViewca = findViewById(R.id.CapacityGridview);

       capacityadapter adapter=new capacityadapter(this,capacityisima,capacityresima,capacitykata,capacityaphonea);
        gridViewca.setAdapter(adapter);

    }
    class capacityadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        capacityadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.capacity,R.id.capacityisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.capacity,parent,false);
            ImageView resim=satir.findViewById(R.id.capacityresim);
            TextView benimbaslik=satir.findViewById(R.id.capacityisim);
            TextView benimkat=satir.findViewById(R.id.capacitykat);
            TextView benimphone=satir.findViewById(R.id.capacityphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}