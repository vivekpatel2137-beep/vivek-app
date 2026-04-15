package com.vivek.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webview = new WebView(this);
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);

        webview.loadUrl("file:///android_asset/index.html");

        setContentView(webview);
    }
}
