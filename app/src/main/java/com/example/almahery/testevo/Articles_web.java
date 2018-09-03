package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Articles_web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_web);

        WebView articlesWebview = (WebView)findViewById(R.id.articleswebview);
        Intent data = getIntent();
        int pagearticles = data.getExtras().getInt("pagearticles");
            pagearticles++;

        if (pagearticles==1)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/50-500.html");

        }
        if (pagearticles==2)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_2.html");
        }
        if (pagearticles==3)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_18.html");
        }
        if (pagearticles==4)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_11.html");
        }
        if (pagearticles==5)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/gaps-in-record-are-realhowever.html");
        }
        if (pagearticles==6)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/oo.html");
        }
        if (pagearticles==7)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_52.html");
        }
        if (pagearticles==8)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_92.html");
        }
        if (pagearticles==9)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/vestigialorgans-university-of-southern.html");
        }
        if (pagearticles==10)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_82.html");
        }
        if (pagearticles==11)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_34.html");
        }
        if (pagearticles==12)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_35.html");
        }
        if (pagearticles==13)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/creation-events.html");
        }
        if (pagearticles==14)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_6.html");
        }
        if (pagearticles==15)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/devolution-evolution-streptomycin-rna.html");
        }
        if (pagearticles==16)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/blog-post_31.html");
        }
        if (pagearticles==17)
        {
            articlesWebview.loadUrl("http://muhammadashrafofficial.blogspot.com/2018/07/sciencedaily-discovery-raises-new.html");
        }


    }
}
