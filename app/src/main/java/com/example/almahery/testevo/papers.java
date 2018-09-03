package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class papers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papers);
        ListView listview = (ListView)findViewById(R.id.listpaper);

        String [] itme = getResources().getStringArray(R.array.paper);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.raw_paper,R.id.textpapero,itme);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentpaper = new Intent(papers.this,paper_web.class);
                intentpaper.putExtra("pagepaper",position);
                startActivity(intentpaper);
            }
        });


    }
}
