package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webhtml extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webhtml);
        WebView vbmain = (WebView)findViewById(R.id.webview);

            vbmain.loadUrl("https://www.youtube.com/playlist?list=PL56IcDjrf3YJr__TEOJ2UOv3jCzht1_yc");

    }
}
