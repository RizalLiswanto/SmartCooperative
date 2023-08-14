package com.example.smartcooperative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// #Animasi

        // Muat animasi dari file XML
        val animKiriAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_kiri)

        // Terapkan animasi pada elemen img_1
        img_1.startAnimation(animKiriAnimation)

        img_1.alpha=0f
        img_1.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this,LoginMainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()

// Animasi#

        }
    }
}