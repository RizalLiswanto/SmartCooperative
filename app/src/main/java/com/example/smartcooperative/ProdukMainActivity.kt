package com.example.smartcooperative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class ProdukMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk_main)


        val bottomSheet = findViewById<FrameLayout>(R.id.sheet) // Ganti dengan ID dari FrameLayout
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        bottomSheetBehavior.peekHeight = 600 // Atur ketinggian peek (terlihat) _Bottom Sheet_
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED // Atur _state_ awal

        // Anda juga bisa menambahkan event listener untuk mengamati perubahan _state_ dari _Bottom Sheet_
        bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Kode yang akan dieksekusi ketika _state_ _Bottom Sheet_ berubah
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Kode yang akan dieksekusi ketika _Bottom Sheet_ digeser (slide)
            }
        })
    }


}