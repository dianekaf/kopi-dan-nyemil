package com.dianekaf.kopidannyemil

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sharedPref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
        val namaUser = sharedPref.getString("SAVED_USERNAME", "Pengguna")
        val tvHaloNama = findViewById<TextView>(R.id.tvHaloNama)
        tvHaloNama?.text = "Halo $namaUser,"

        fun tambahKePesanan(namaMenu: String) {
            val pesananLama = sharedPref.getString("ORDERED_ITEMS", "")
            val pesananBaru = if (pesananLama.isNullOrEmpty()) "- $namaMenu" else "$pesananLama\n- $namaMenu"

            sharedPref.edit().putString("ORDERED_ITEMS", pesananBaru).apply()
            Toast.makeText(this, "$namaMenu ditambahkan!", Toast.LENGTH_SHORT).show()
        }

        val menuList = mapOf(
            R.id.item1 to "Kopi Susu Gula Aren - Rp 18.000",
            R.id.item2 to "Kopi Brown Sugar - Rp 15.000",
            R.id.item3 to "Espresso - Rp 10.000",
            R.id.item4 to "Americano - Rp 10.000",
            R.id.item5 to "Cappuccino - Rp 15.000",
            R.id.item6 to "Caffe Latte - Rp 15.000",
            R.id.item7 to "Creamy Macchiato - Rp 15.000",
            R.id.item8 to "Affogato - Rp 15.000",
            R.id.item9 to "Matcha Latte - Rp 24.000",
            R.id.item10 to "Donat Cokelat - Rp 12.000",
            R.id.item11 to "Sourdough Loaf - Rp 25.000",
            R.id.item12 to "Ayam Bakar - Rp 14.000",
            R.id.item13 to "Ayam Goreng - Rp 14.000",
            R.id.item14 to "Ayam Geprek - Rp 15.000",
            R.id.item15 to "Ayam Penyet - Rp 15.000",
            R.id.item16 to "Ikan Bakar - Rp 13.000",
            R.id.item17 to "Ikan Goreng - Rp 13.000"
        )

        for ((id, namaMenu) in menuList) {
            findViewById<LinearLayout>(id)?.setOnClickListener {
                tambahKePesanan(namaMenu)
            }
        }

        findViewById<Button>(R.id.btnNavOrder)?.setOnClickListener {
            startActivity(Intent(this, OrderAddressActivity::class.java))
        }
        findViewById<Button>(R.id.btnNavProfile)?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}