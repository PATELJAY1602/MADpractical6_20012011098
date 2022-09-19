package com.example.madpractical6_20012011098

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val  mediadController = MediaController(this)
            val uri: Uri = Uri.parse("android.resource://" + packageName +"/" + R.raw.thestoryoflight )
            val myvideoview = findViewById<VideoView>(R.id.myvideo)
        myvideoview.setMediaController(mediadController)
        mediadController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
        val button = findViewById<FloatingActionButton>(R.id.button1)
        button.setOnClickListener(){
            Intent()
        }





    }
}