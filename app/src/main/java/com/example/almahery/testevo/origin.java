package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class origin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origin);
        ListView listvieworigin = (ListView)findViewById(R.id.listvieworigino);

        String [] itme = getResources().getStringArray(R.array.origin);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.raw_paper,R.id.textpapero,itme);
        listvieworigin.setAdapter(arrayAdapter);

        listvieworigin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentorigin= new Intent(origin.this,origin_web.class);
                intentorigin.putExtra("pageorigin",position);
                startActivity(intentorigin);
            }
        });

    }
}
