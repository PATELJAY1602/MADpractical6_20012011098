package com.example.madpractical6_20012011098

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class YoutubeActivity : AppCompatActivity() {
    private val youtubeId = "nqye02H_H6I"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview = findViewById<WebView>(R.id.web1)
        val settings = mywebview.settings
        settings.javaScriptEnabled = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true

        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}