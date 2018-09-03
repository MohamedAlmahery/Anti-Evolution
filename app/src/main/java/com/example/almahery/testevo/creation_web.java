package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class creation_web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_web);

        WebView webViewcreation = (WebView)findViewById(R.id.webviewCreation);
        Intent data = getIntent();
        int pagecreation = data.getExtras().getInt("pagecreation");
            pagecreation++;

        if (pagecreation==1)
        {
            webViewcreation.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/224-nature-y.html");

        }
        if (pagecreation==2)
        {
            webViewcreation.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_4.html");
        }
        if (pagecreation==3)
        {
            webViewcreation.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_56.html");
        }
        if (pagecreation==4)
        {
            webViewcreation.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_76.html");
        }
        if (pagecreation==5)
        {
            webViewcreation.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_63.html");
        }

    }

}
