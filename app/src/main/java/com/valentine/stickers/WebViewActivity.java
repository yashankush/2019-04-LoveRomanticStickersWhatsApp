package com.valentine.stickers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = findViewById(R.id.webview_privacy_policy);
///this is show privacy policy
        webView.loadUrl(getString(R.string.privacy_policy_url));

        //add url in string.xml
    }
}
