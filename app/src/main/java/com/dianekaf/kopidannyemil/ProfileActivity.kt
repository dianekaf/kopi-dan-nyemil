package com.dianekaf.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnHome: Button = findViewById(R.id.btnProfileNavHome)
        val btnOrder: Button = findViewById(R.id.btnProfileNavOrder)
        val btnSave: Button = findViewById(R.id.btnSaveProfile)

        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        btnOrder.setOnClickListener {
            startActivity(Intent(this, OrderAddressActivity::class.java))
            finish()
        }

        btnSave.setOnClickListener {
            Toast.makeText(this, "Profile disimpan!", Toast.LENGTH_SHORT).show()
        }
    }
}