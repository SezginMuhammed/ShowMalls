package com.example.showmalls;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String avmisim[]={"Acr Loft AVM", "Airport Outlet Center", "Akbatı AVM", "Axis AVM", "Buyaka AVM", "Capacity AVM",
            "Capitol AVM", "Deposite AVM", "Forum İstanbul AVM", "Historia AVM",
           "İstinye Park AVM",  "Mall Of İstanbul AVM",
            "Maltepe Park AVM", "Marmara Forum AVM",  "Metroport AVM",  "Optimum Outlet AVM",
            "Pelican Mall AVM", "Star City AVM", "Torium AVM",  "Zorlu Center AVM", "212 AVM",
            "Cevahir AVM","Kanyon AVM","Kozzy AVM","Marmara Park AVM",
    };
    int avmresim[]={ R.drawable.acrloft,R.drawable.airportoutlet,R.drawable.akbati,
           R.drawable.axis,
    R.drawable.buyaka,R.drawable.capacity, R.drawable.capitol,
    R.drawable.deposite,R.drawable.forumistanbul,R.drawable.historia,
    R.drawable.istinyepark,R.drawable.mallofistanbul,
    R.drawable.maltepepark,R.drawable.marmaraforum,R.drawable.metroport,R.drawable.optimumoutlet,
    R.drawable.pelicanmall,R.drawable.starcity,R.drawable.torium, R.drawable.zorlucenter,
            R.drawable.ikiyuzoniki, R.drawable.cevahir,R.drawable.kanyon,R.drawable.kozzy,
            R.drawable.marmarapark, };
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.avmGridview);
        avmAdapter adapter=new avmAdapter(this,avmisim,avmresim);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent=new Intent(MainActivity.this, AcerLoftActivity.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent=new Intent(MainActivity.this,AirportActivity.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent=new Intent(MainActivity.this,AkbatiActivity.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent=new Intent(MainActivity.this,AxisActivity.class);
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent=new Intent(MainActivity.this,BuyakaActivity.class);
                    startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent=new Intent(MainActivity.this,CapacityActivity.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent=new Intent(MainActivity.this,CapitolActivity.class);
                    startActivity(intent);
                }
                else if(position==7)
                {
                    Intent intent=new Intent(MainActivity.this,DepositoActivity.class);
                    startActivity(intent);
                }
                else if(position==8)
                {
                    Intent intent=new Intent(MainActivity.this,ForumActivity.class);
                    startActivity(intent);
                }
                else if(position==9)
                {
                    Intent intent=new Intent(MainActivity.this,HistoriaActivity.class);
                    startActivity(intent);
                }
                else if(position==10)
                {
                    Intent intent=new Intent(MainActivity.this,IstinyeActivity.class);
                    startActivity(intent);
                }
                else if(position==11)
                {
                    Intent intent=new Intent(MainActivity.this,MallofActivity.class);
                    startActivity(intent);
                }
                else if(position==12)
                {
                    Intent intent=new Intent(MainActivity.this,MaltepeActivity.class);
                    startActivity(intent);
                }
                else if(position==13)
                {
                    Intent intent=new Intent(MainActivity.this,MarmaraforumActivity.class);
                    startActivity(intent);
                }
                else if(position==14)
                {
                    Intent intent=new Intent(MainActivity.this,MetroportActivity.class);
                    startActivity(intent);
                }
                else if(position==15)
                {
                    Intent intent=new Intent(MainActivity.this,OptimumActivity.class);
                    startActivity(intent);
                }
                else if(position==16)
                {
                    Intent intent=new Intent(MainActivity.this,PelicanActivity.class);
                    startActivity(intent);
                }
                else if(position==17)
                {
                    Intent intent=new Intent(MainActivity.this,StarcityActivity.class);
                    startActivity(intent);
                }
                else if(position==18)
                {
                    Intent intent=new Intent(MainActivity.this,ToriumActivity.class);
                    startActivity(intent);
                }
                else if(position==19)
                {
                    Intent intent=new Intent(MainActivity.this,ZorluActivity.class);
                    startActivity(intent);
                }
                else if(position==20)
                {
                    Intent intent=new Intent(MainActivity.this,ikiActivity.class);
                    startActivity(intent);
                }
                else if(position==21)
                {
                    Intent intent=new Intent(MainActivity.this,CevahirActivity.class);
                    startActivity(intent);
                }
                else if(position==22)
                {
                    Intent intent=new Intent(MainActivity.this,KanyonActivity.class);
                    startActivity(intent);
                }
                else if(position==23)
                {
                    Intent intent=new Intent(MainActivity.this,KozzyActivity.class);
                    startActivity(intent);
                }
                else if(position==24)
                {
                    Intent intent=new Intent(MainActivity.this,MarmaraparkActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
    class avmAdapter extends ArrayAdapter<String>{
        Context context;
        String avmisima[];
        int avmresima[];
        avmAdapter(Context c, String[] isimaa, int[] resimavm){
            super(c,R.layout.avmler,R.id.isimavm,isimaa);
            this.context=c;
            this.avmisima=isimaa;
            this.avmresima=resimavm;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View satir=layoutInflater.inflate(R.layout.avmler,parent,false);
            ImageView resim=satir.findViewById(R.id.resimavm);
            TextView avmism=satir.findViewById(R.id.isimavm);

            resim.setImageResource(avmresima[position]);
            avmism.setText(avmisima[position]);
            return satir;
        }
    }
}