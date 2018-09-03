package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Creation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        ListView listviewcreation = (ListView)findViewById(R.id.listviewcreation);

        String [] itme = getResources().getStringArray(R.array.creation);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.raw_paper,R.id.textpapero,itme);
        listviewcreation.setAdapter(arrayAdapter);

        listviewcreation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intentcreation= new Intent(Creation.this,creation_web.class);
                intentcreation.putExtra("pagecreation",position);
                startActivity(intentcreation);
            }
        });
    }
}
