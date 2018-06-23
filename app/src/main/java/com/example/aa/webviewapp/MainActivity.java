package com.example.aa.webviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

   private static WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().getJavaScriptEnabled();
        //webView.loadUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Sachin_Pilot_at_the_India_Economic_Summit_2010_cropped.jpg/39px-Sachin_Pilot_at_the_India_Economic_Summit_2010_cropped.jpg");
        webView.loadUrl("https://www.google.com");
    }
}
