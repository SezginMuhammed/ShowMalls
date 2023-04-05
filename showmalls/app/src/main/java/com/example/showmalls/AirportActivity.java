package com.example.showmalls;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class AirportActivity extends AppCompatActivity {
    GridView gridViewvai;
    String airportisima[]={"MİGROS", "ÖZDİLEK", "SAMSUNG", "SİEMENS", "TURKCELL",
            "BİSSE", "D'S DAMAT", "DERİMOD", "İPEKYOL", "LC WAİKİKİ", "MUDO", "PENTİ", "TURKTELEKOM",
            "VAKKO", "MADO", "PAŞAFIRINI",
            "FLO", "GUSTO", "KOTON", "LİNENS", "SARAR", "SÜVARİ GİYİM", "WATSON", "YEŞİL KUNDURA",
            "ADİDAS", "COLLEZİONE", "DAGİ", "GRATİS", "HUMMEL", "MAVİ", "THE COMPANY", "US POLO ASSN",
            "BURGER KING", "BEREKET DÖNER", "BURSA KEBAP EVİ", "GREEN SALADS", "KÖFTECİ RAMİZ", "MC DONALD'S", "PİDEM",
            "POPEYES", "TAVUK DÜNYASI"
            };
    int airportresima[]={R.drawable.migros,R.drawable.ozdilek,R.drawable.samsung,R.drawable.siemens,R.drawable.turkcell,
            R.drawable.bisse,R.drawable.dsdamat,R.drawable.derimod,R.drawable.ipekyol,R.drawable.lcwaikiki,R.drawable.mudo,
            R.drawable.penti,R.drawable.turktelekom,R.drawable.vakko,R.drawable.mado,R.drawable.pasafirini,R.drawable.flo,R.drawable.gusto,
            R.drawable.koton,R.drawable.linens,R.drawable.sarar,R.drawable.suvari,R.drawable.watsons,R.drawable.yesilkundra,
            R.drawable.adidas,R.drawable.collezione,R.drawable.dagi,R.drawable.gratis,R.drawable.hummel,R.drawable.mavi,R.drawable.thecompany,R.drawable.uspoloassn,
            R.drawable.burgerking,R.drawable.bereketdoner,R.drawable.bursakebap,R.drawable.greensalads,R.drawable.kofteciramiz,
            R.drawable.mcdonalds,R.drawable.pidem,R.drawable.popeyes,R.drawable.tavukdunyasi};
    String airportkata[]={"Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:1",
            "Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:2","Kat:2","Kat:2","Kat:2","Kat:2",
            "Kat:2","Kat:2","Kat:2","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3","Kat:3"};
    String airportphonea[]={"08503102184", "02124658763", "02124658514", "02124658654", "05385560201",
            "02124653560", "02124655211", "02124652860", "02124658454", "02124658090", "4446836",
            "02124658172", "02124650710", "02124658440", "02124656384", "02124658568", "05335931257",
            "02124652989", "02124657228", "02124650889", "02124655672", "02124653875", "05548083290",
            "02124658692", "08502106900", "02124650469", "02127033003", "02124657795", "02124655798",
            "02124658734", "02124658549", "02124650467", "02124657090", "02124658479", "05302901260",
            "02124658786", "02124657065", "02122819996", "02124658616","02124658616","02124656384",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport);
        gridViewvai= findViewById(R.id.airportGridview);

        airporttadapter adapter=new airporttadapter(this,airportisima,airportresima,airportkata,airportphonea);
        gridViewvai.setAdapter(adapter);

    }
    class airporttadapter extends ArrayAdapter<String>{
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        airporttadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.acerloft,R.id.acerloftisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.airport,parent,false);
            ImageView resim=satir.findViewById(R.id.airportresim);
            TextView benimbaslik=satir.findViewById(R.id.airportisim);
            TextView benimkat=satir.findViewById(R.id.airportkat);
            TextView benimphone=satir.findViewById(R.id.airportphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}