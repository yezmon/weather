package com.example.webweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.app.Activity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.tianqi.com/shanghai");
        Button bj=(Button)findViewById(R.id.btn_bj);
        bj.setOnClickListener(this);
        Button sh=(Button)findViewById(R.id.btn_sh);
        sh.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_bj:
                openUrl("beijing");
                break;
            case R.id.btn_sh:
                openUrl("shanghai");
                break;
        }
    }
    private void openUrl(String id)
    {
        webView.loadUrl("https://www.tianqi.com/"+id);
    }
}

