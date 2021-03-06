package com.example.healthplusapp_zw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val mohccLogo = findViewById<ImageView>(R.id.mohccLogo)
        val ivWave = findViewById<ImageView>(R.id.ivWave)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        mohccLogo.startAnimation(topAnimation)
        ivWave.startAnimation(bottomAnimation)
        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}