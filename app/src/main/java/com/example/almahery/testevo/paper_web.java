package com.example.almahery.testevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper_web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_web);

        WebView webViewpaper = (WebView)findViewById(R.id.webpaper);
        Intent data = getIntent();
        int pagepaper = data.getExtras().getInt("pagepaper");
            pagepaper++;

        if (pagepaper==1)
        {

            webViewpaper.loadUrl("https://www.vox.com/science-and-health/2016/11/23/13713324/why-peer-review-in-science-often-fails/");
        }
        if (pagepaper==2)
        {
            webViewpaper.loadUrl("https://www.newscientist.com/article/dn27325-baboon-bone-found-in-famous-lucy-skeleton/");
        }
        if (pagepaper==3)
        {
            webViewpaper.loadUrl("https://news.nationalgeographic.com/news/2002/11/1120_021120_raptor.html");
        }
        if (pagepaper==4)
        {
            webViewpaper.loadUrl("https://www.timeshighereducation.com/features/neo-darwinism-has-failed-as-an-evolutionary-theory/98152.article");
        }
        if (pagepaper==5)
        {
            webViewpaper.loadUrl("https://www.nature.com/news/2011/110727/full/news.2011.443.html");
        }
        if (pagepaper==6)
        {
            webViewpaper.loadUrl("file:///android_asset/tafarat.html");
        }
        if (pagepaper==7)
        {
            webViewpaper.loadUrl("https://www.ncbi.nlm.nih.gov/pubmed/18465197");
        }
        if (pagepaper==8)
        {
            webViewpaper.loadUrl("https://www.ncbi.nlm.nih.gov/pubmed/15563395");
        }
        if (pagepaper==9)
        {
            webViewpaper.loadUrl("https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3246854/");
        }
        if (pagepaper==10)
        {
            webViewpaper.loadUrl("https://www.ncbi.nlm.nih.gov/pubmed/15321723");
        }

    }
}
