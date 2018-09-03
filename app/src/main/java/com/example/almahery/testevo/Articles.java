package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Articles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
        ListView listviewArticals = (ListView)findViewById(R.id.listviewarticals);

        String [] itme = getResources().getStringArray(R.array.Articles);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.raw_paper,R.id.textpapero,itme);
        listviewArticals.setAdapter(arrayAdapter);

        listviewArticals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentarticles= new Intent(Articles.this,Articles_web.class);
                intentarticles.putExtra("pagearticles",position);
                startActivity(intentarticles);
            }
        });
    }
}
