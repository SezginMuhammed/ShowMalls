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

public class BuyakaActivity extends AppCompatActivity {
    GridView gridViewbu;
    String buyakaisima[]={"Arçelik","Atasun Optik","Bosh",
            "Chakra","D&R","E-Bebek","English Home",
            "Karaca","Koçak","Linens","Migros",
            "Paşabahçe","Penti","Saat&Saat","Samsung",
            "Siemens","Sunglass Hut","Turkcell",
            "Vodafone","Yatsan Tempur",
            "Bershka","Divarese","Flormar","FunLab",
            "Hotiç","İntimissimi","İpekyol","Mark&Spencer",
            "Masimo Dutti","Mavi","Nautica","New Balance",
            "Oysho","Pull&Bear","SuperStep","Watsons","Zara",
            "Beymen Cub","Cacharel","Calzedonia","Damat Tween","Kiehl's",
            "Lacoste","Mudo","Pierre Cardin","Samsonite",
            "Sephora","So Chic","Swarovski","Us Polo Assn","W Collection",
            "Yargıcı","Yves Rocher",
            "B&g Store","Benetton","Gant",
            "Gap","Gratis","Gusto"

    };
    int buyakaresima[]={R.drawable.arcelik,R.drawable.atasunoptik,R.drawable.bosh,R.drawable.chakra,
            R.drawable.dandr, R.drawable.ebebek,R.drawable.englishhome,R.drawable.karaca,R.drawable.kocakgold,
            R.drawable.linens,R.drawable.migros, R.drawable.pasabahce,R.drawable.penti,R.drawable.saatsaat,
            R.drawable.samsung,R.drawable.siemens,R.drawable.sungass,R.drawable.turkcell, R.drawable.vodafone,
            R.drawable.yatsan,R.drawable.bershka,R.drawable.divarese,R.drawable.flormar,R.drawable.funlab,
            R.drawable.hotic,R.drawable.intimissimi,R.drawable.ipekyol,
            R.drawable.marks,R.drawable.massimo,R.drawable.mavi,R.drawable.nautica,
            R.drawable.newbalance, R.drawable.oysho,R.drawable.pullbear,R.drawable.superstar,R.drawable.watsons,
            R.drawable.zara,R.drawable.beymenclub, R.drawable.cacharel,R.drawable.calzedonia,R.drawable.damatferit,
            R.drawable.kiehls,R.drawable.lacoste,R.drawable.mudo,R.drawable.pierrecardin, R.drawable.samsonite,
            R.drawable.sephora,R.drawable.sochick,R.drawable.swarovski,R.drawable.uspoloassn,R.drawable.wcollection,
            R.drawable.yargici,R.drawable.yves,R.drawable.bgstore,
            R.drawable.benetton,R.drawable.gant,R.drawable.gap,
            R.drawable.gratis,R.drawable.gusto};
    String buyakakata[]={"Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2",
            "Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2","Kat:-2",
            "Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1",
            "Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:-1","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin","Kat:Zemin",
            "Kat:Zemin","Kat:Zemin","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1","Kat:1",};
    String buyakaphonea[] ={"02162907708","02162907863","02162907862","02122907666",
            "02162907517","02122907568","02169873941","05306926992",
            "02162907794","02162907692","08503102972","02162907680","02162907838",
            "02162907845","02162907585","02162907798","02162907828","02162907702",
            "02162907834","02162907786","02162907760","02166291374","05330310203",
            "05308756288","02165042264","05309403485","02165100347","02162907590",
            "02162907753","02162907853","02162907865","02162907625","02162907777","02162907776",
            "02162907605","02162907830","02162907744","02162907509","02165106976","02162907688","02165046076",
            "08502213485","02162907611","02126446836","02162907611","02164446836","02162907849",
            "02162907626","05309408343","02162907643","02165045291","02162907560",
            "02162170301","02162907532","02162907860","02162907659","02162907719",
            "02162907967","02162907957","02162663357","02167052768",
            "02162907670",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyaka);
        gridViewbu = findViewById(R.id.BuyakaGridview);

        buyakaadapter adapter=new buyakaadapter(this,buyakaisima,buyakaresima,buyakakata,buyakaphonea);
        gridViewbu.setAdapter(adapter);

    }
    class buyakaadapter extends ArrayAdapter<String> {
        Context context;
        String acerisimaa[];
        int acerresimaa[];
        String acerkataa[];
        String acerphoneaa[];
        buyakaadapter(Context c,String baslik[],int acerloftresim[],String acerlofkat[],String acerloftphone[]){
            super(c, R.layout.buyaka,R.id.buyakaisim,baslik);
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
            View satir=layoutInflater.inflate(R.layout.buyaka,parent,false);
            ImageView resim=satir.findViewById(R.id.buyakaresim);
            TextView benimbaslik=satir.findViewById(R.id.buyakaisim);
            TextView benimkat=satir.findViewById(R.id.buyakakat);
            TextView benimphone=satir.findViewById(R.id.buyakaphone);



            resim.setImageResource(acerresimaa[position]);
            benimbaslik.setText(acerisimaa[position]);
            benimkat.setText(acerkataa[position]);
            benimphone.setText(acerphoneaa[position]);

            return satir;
        }
    }
}