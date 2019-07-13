package com.example.kbluue_.ALC;

import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        initWebView();
    }

    private void initWebView(){

        final ProgressDialog dialog = ProgressDialog.show(this, "Loading...", "Please Wait", true);
        dialog.setCancelable(false);

        final WebViewClient client = new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                dialog.dismiss();
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                dialog.show();
                view.loadUrl(request.getUrl().toString());
                return true;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                if (handler != null){
                    handler.proceed();
                } else {
                    super.onReceivedSslError(view, null, error);
                }
            }
        };

        view = (WebView) findViewById(R.id.webview);
        view.setWebViewClient(client);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        view.loadUrl("https://andela.com/alc/");
    }

    @Override
    public void onBackPressed() {
        if (view.canGoBack()){
            view.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
