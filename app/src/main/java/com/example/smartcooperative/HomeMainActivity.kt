package com.example.smartcooperative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.smartcooperative.databinding.ActivityHomeMainBinding

class HomeMainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//# Default menu Home
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, homeFragment)
            .commit()
// Default menu Home #

//# Klick menu dan fragment1
        binding = ActivityHomeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.cart -> replaceFragment(CartFragment())
                R.id.profil ->{
                    val i = Intent(this,ProfilMainActivity::class.java)
                    startActivity(i)
                    finish()


                }

                R.id.notifikasibtn -> {
                    val fragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.frame, NotifikasiFragment())
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()
                    binding.bottomNavigationView.menu.findItem(R.id.notifikasibtn).isEnabled = false
                }
                else -> {}
            }
            true
        }
// Klick menu dan fragment1 #

//#select menu ke cart
        val selectedFragment = intent.getStringExtra("selectedFragment")
        if (selectedFragment == "cart") {
            val cartFragment = CartFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, cartFragment)
                .commit()
            binding.bottomNavigationView.selectedItemId = R.id.cart

        }
//select menu ke cart #
    }

//#memanggil replace ,klick menu dan fragment2
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragment)
        fragmentTransaction.commit()
    }
//memanggil replace ,klick menu dan fragment2 #
}