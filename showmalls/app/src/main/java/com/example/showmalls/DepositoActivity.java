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

public class DepositoActivity extends AppCompatActivity {
    GridView gridViewde;
    String depositoisima[]={
            "Migros ","LC Waikiki ","Flo ","Defacto" ,"Penti ","D&R ","Mavi Jeans ","Teknosa" ,
            "Marks & Spencer" ,"LCW Home ","Boyner Outlet","Gratis" ,
            "English Home", "İpekyol ","Hotiç ","Lumberjack" ,"Divarese ",
            "Cinemaximum "


    };
    int depositoresima[]={R.drawable.migros,R.drawable.lcwaikiki,R.drawable.flo,R.drawable.defacto,
            R.drawable.penti, R.drawable.dandr,R.drawable.mavi,R.drawable.teknosa,R.drawable.marks,
            R.drawable.lcwaikiki,R.drawable.boyner, R.drawable.gratis,R.drawable.englishhome,R.drawable.ipekyol,
            R.drawable.hotic,R.drawable.lumberjack,R.drawable.divarese,R.drawable.cinemaxmum
    };
    String depositokata[]={"Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:1","Kat:1","Kat:1","Kat:1",
            "Kat:2", "Kat:2", "Kat:2", "Kat:2", "Kat:2","Kat:3"};
    String depositophonea[] ={"0216 444 10 10","0216 325 28 26","0216 325 28 12","0216 325 28 36",
            "0216 325 28 11","0216 325 28 06","0216 325 28 31","0216 325 28 03",
            "0216 325 28 05","0216 325 28 50","0216 325 28 59","0216 325 28 51",
            "0216 325 28 53","0216 325 28 61","0216 325 28 56","0216 325 28 58",
            "0216 325 28 60","0216 325 28 57",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposito);
        gridViewde = findViewById(R.id.DepositoGridview);

        depositoadapter adapter=new depositoadapter(this,depositoisima,depositoresima,depositokata,depositophonea);
        gridViewde.setAdapter(adapter);

    }
    class depositoadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        depositoadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.deposito,R.id.depositoisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.deposito,parent,false);
            ImageView resim=satir.findViewById(R.id.depositoresim);
            TextView benimbaslik=satir.findViewById(R.id.depositoisim);
            TextView benimkat=satir.findViewById(R.id.depositokat);
            TextView benimphone=satir.findViewById(R.id.depositophone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}