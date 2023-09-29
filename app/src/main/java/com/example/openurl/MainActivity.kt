@file:Suppress("DEPRECATION")

package com.example.openurl

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        // make sure the status bar and navigation bar are hidden
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        }
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.domStorageEnabled = true

        myWebView.loadUrl("https://signage.api-magnafoodservice.co.uk/")
    }
}

