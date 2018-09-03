package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class origin_web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origin_web);

        WebView webVieworigin = (WebView)findViewById(R.id.originwebview);
        Intent data = getIntent();
        int pageorigin = data.getExtras().getInt("pageorigin");
            pageorigin++;

        if (pageorigin==1)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/homo-habilis-homo-habilis-meave-leakey.html");

        }
        if (pageorigin==2)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/ardipithecusramidus.html");
        }
        if (pageorigin==3)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/australopithecus-sediba.html");
        }
        if (pageorigin==4)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/australopithecus-sediba_1.html");
        }
        if (pageorigin==5)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post.html");
        }
        if (pageorigin==6)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/homo-floresiensis.html");
        }
        if (pageorigin==7)
        {
            webVieworigin.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_1.html");
        }

    }
}
