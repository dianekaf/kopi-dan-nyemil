package com.dianekaf.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OrderAddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_address)

        val btnSubmitOrder: Button = findViewById(R.id.btnSubmitOrder)

        btnSubmitOrder.setOnClickListener {
            startActivity(Intent(this, OrderConfirmationActivity::class.java))
        }
    }
}