package com.dianekaf.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNavOrder: Button = findViewById(R.id.btnNavOrder)
        val btnNavProfile: Button = findViewById(R.id.btnNavProfile)
        val item1: LinearLayout = findViewById(R.id.item1)

        btnNavProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        val goToOrder = {
            startActivity(Intent(this, OrderAddressActivity::class.java))
        }
        btnNavOrder.setOnClickListener { goToOrder() }
        item1.setOnClickListener { goToOrder() }
    }
}