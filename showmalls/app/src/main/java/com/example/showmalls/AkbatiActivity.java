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

public class AkbatiActivity extends AppCompatActivity {
    GridView gridViewak;
    String akbatiisima[]={"Adapazarı Döviz Altın", "Dry Corner", "My Choice", "Petbox", "Röleve Terzi", "Saygı Lostra",
            "Scholl Concepts Oto Yıkama",
            "5M Migros",
            "Akbank",
            "Akbatı Eczanesi",
            "Arçelik",
            "Arifoğlu",
            "Bosch",
            "Choc'nette",
            "Deniz Bank",
            "Altınbaş",
            "Altınyıldız",
            "Atasay",
            "Barbour",
            "Beymen Club",
            "Bluemint",
            "BUBBLE TEA",
            "Cacharel",
            "Atasun Optik",
            "B&G Store",
            "Balon Evi",
            "Bambi",
            "Bershka",
            "By Milo",
            "Carters Oshkosh",
            "Columbia",
            "Otantik",
            };
    int akbatitresima[]={R.drawable.adapazaridoviz,R.drawable.drycorner,R.drawable.mychoice,R.drawable.petbox,R.drawable.roleveterzi,
            R.drawable.saygilostra,R.drawable.schoolconsept,R.drawable.migros,R.drawable.akbank,R.drawable.akbati,R.drawable.arcelik,
            R.drawable.arifoglu,R.drawable.bosh,R.drawable.chocnette,R.drawable.denizbank,R.drawable.altinbas,R.drawable.altinyildiz,R.drawable.atasay,
            R.drawable.barbour,R.drawable.beymenclub,R.drawable.bluemint,R.drawable.bubbletea,R.drawable.cacharel,R.drawable.atasunoptik,
            R.drawable.bgstore,R.drawable.balonevi,R.drawable.bambi, R.drawable.bershka,R.drawable.bymilo,R.drawable.carterts,
            R.drawable.columbia,R.drawable.otantik};
    String akbatikata[]={"Kat:P1","Kat:P1","Kat:P1","Kat:P1","Kat:P1","Kat:P1","Kat:P1",
            "Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1",
    "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",
    "KAt:2"};
    String akbatiphonea[] ={"0212 397 01 02",
            "0212 397 01 52",
            "0212 813 73 83",
            "0850 500 05 55",
            "0212 397 74 86",
            "0212 803 01 42",
            "0212 397 70 49",
            "0850 310 29 99",
            "-",
            "0212 397 01 17",
            "0212 823 63 16",
            "0212 803 86 93",
            "0212 397 17 22 ",
            "0533 036 87 50",
            "-",
            "0212 397 74 80",
            "0530 581 35 16",
            "0212 397 70 40",
            "0536 495 96 27",
            "0212 397 74 05",
            "-",
            "-",
            "0536 267 43 04",
            " 0543 249 25 33",
            "0530 606 46 09",
            " 0534 364 48 93",
            "0212 397 71 90",
            "0212 397 73 47",
            "0212 397 74 82",
            "0212 777 85 38",
            "0212 890 65 26",
            "0543 457 94 79",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbati);
        gridViewak = findViewById(R.id.akbatiGridview);

        akbatiadapter adapter=new akbatiadapter(this,akbatiisima,akbatitresima,akbatikata,akbatiphonea);
        gridViewak.setAdapter(adapter);

    }
    class akbatiadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        akbatiadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.acerloft,R.id.akbatitisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.akbati,parent,false);
            ImageView resim=satir.findViewById(R.id.akbatiresim);
            TextView benimbaslik=satir.findViewById(R.id.akbatitisim);
            TextView benimkat=satir.findViewById(R.id.akbatitkat);
            TextView benimphone=satir.findViewById(R.id.akbatitphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}