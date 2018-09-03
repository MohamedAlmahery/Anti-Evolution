package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        MobileAds.initialize(this, "ca-app-pub-1455679682641301~2346226858");

        ListView listmain = (ListView)findViewById(R.id.listView);

        String [] itme = getResources().getStringArray(R.array.index);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.row_itme,R.id.textitme,itme);
        listmain.setAdapter(arrayAdapter);

        listmain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0)
                {
                    Intent intentmain = new Intent(MainActivity.this,books.class);
                    startActivity(intentmain);
                }

                if (position==1)
                {
                    Intent intentmain = new Intent(MainActivity.this,papers.class);
                    startActivity(intentmain);
                }

                if (position==2)
                {
                    Intent intentmain = new Intent(MainActivity.this,origin.class);
                    startActivity(intentmain);
                }

                if (position==3)
                {
                    Intent intentmain = new Intent(MainActivity.this,Creation.class);
                    startActivity(intentmain);
                }

                if (position==4)
                {
                    Intent intentmain = new Intent(MainActivity.this,Articles.class);
                    startActivity(intentmain);
                }
                if (position==5)
                {
                        Intent intentmain = new Intent(MainActivity.this,webhtml.class);
                    startActivity(intentmain);
                }
                if (position==6) {
                    Intent intentmain = new Intent(MainActivity.this, About.class);
                    startActivity(intentmain);
                }
            }
        });


        }
}
