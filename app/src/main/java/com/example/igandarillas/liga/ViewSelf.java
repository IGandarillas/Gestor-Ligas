package com.example.igandarillas.liga;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by IGandarillas on 27/05/2015.
 */
public class ViewSelf extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
