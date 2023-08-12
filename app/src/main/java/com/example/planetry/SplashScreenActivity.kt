package com.example.planetry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.airbnb.lottie.LottieAnimationView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val anim = findViewById<LottieAnimationView>(R.id.lottieanim)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            anim.visibility= View.VISIBLE
            anim.playAnimation()
            startActivity(Intent(this,MainActivity::class.java))
                                                             },4000)


    }
}