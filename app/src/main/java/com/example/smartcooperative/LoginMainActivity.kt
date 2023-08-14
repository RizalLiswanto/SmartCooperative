package com.example.smartcooperative

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login_main.*


class LoginMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_main)

//#animasi
        val animKebawahAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_bawah)

        linear.visibility = View.INVISIBLE
        button_1.visibility = View.INVISIBLE
        buttonreset.visibility = View.INVISIBLE
        buttonAkun.visibility = View.INVISIBLE

        logo2.startAnimation(animKebawahAnimation)

        animKebawahAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {
                // Animasi selesai, kembalikan visibilitas elemen-elemen lain
                linear.visibility = View.VISIBLE
                button_1.visibility = View.VISIBLE
                buttonreset.visibility = View.VISIBLE
                buttonAkun.visibility = View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation?) {}
            })
//animasi#
        val btnHalamanutama = findViewById<Button>(R.id.button_1)
        btnHalamanutama.setOnClickListener(){

            startActivity(Intent(this,HomeMainActivity::class.java))

            finish()

        }

       val btnRegister = findViewById<Button>(R.id.btnregister)
        btnRegister.setOnClickListener(){

        startActivity(Intent(this,RegisterMainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()

        }




    }


}


