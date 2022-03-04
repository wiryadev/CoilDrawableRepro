package com.wiryadev.coildrawablerepro

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Coil
        findViewById<ImageView>(R.id.iv_coil).load(R.drawable.ic_baseline_android_24)

        // Glide
        Glide.with(this)
            .load(R.drawable.ic_baseline_android_24)
            .into(findViewById<ImageView>(R.id.iv_glide))

        // setImageResource
        findViewById<ImageView>(R.id.iv_image_resource).setImageResource(R.drawable.ic_baseline_android_24)
    }
}