package com.example.umeshyadav.tech;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Main2Activity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String url="http://www.google.com";
        WebView myWebView=(WebView)findViewById(R.id.webView);
        WebSettings webSettings=myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(url);
        myWebView.setWebViewClient(new WebViewClient());
    }
//back button code
    /*@Override
    public void onBackPressed() {

        if (myWebView.canGoBack()){
            myWebView.goBack();
        }
        else {
            super.onBackPressed();
        }

    }*/

    /*@Override
    public void onBackPressed() {
        {
            if(myWebView.canGoBack()){
                myWebView.goBack();
            }
            else{
                //super.onBackPressed();


                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you want to exit?");
                builder.setCancelable(false);
                builder.setPositiveButton(android.R.string.yes,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //showInterstitial();
                                finish();
                            }
                        });
                builder.setNegativeButton(android.R.string.no,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                            }

                        });
                AlertDialog alert = builder.create();
                alert.show();

            }


        }
    }
   */

}
