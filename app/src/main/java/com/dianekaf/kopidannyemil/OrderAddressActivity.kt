package com.dianekaf.kopidannyemil

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderAddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_address)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack?.setOnClickListener { finish() }

        val sharedPref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
        val daftarPesanan = sharedPref.getString("ORDERED_ITEMS", "")

        val tvDaftarPesanan = findViewById<TextView>(R.id.tvDaftarPesanan)
        if (!daftarPesanan.isNullOrEmpty()) {
            tvDaftarPesanan.text = daftarPesanan
        }

        val etOrderName = findViewById<EditText>(R.id.etOrderName)
        val etOrderAddress = findViewById<EditText>(R.id.etOrderAddress)
        val etOrderDetail = findViewById<EditText>(R.id.etOrderDetail)
        val btnSubmitOrder = findViewById<Button>(R.id.btnSubmitOrder)

        btnSubmitOrder.setOnClickListener {
            val name = etOrderName.text.toString().trim()
            val address = etOrderAddress.text.toString().trim()
            val detail = etOrderDetail.text.toString().trim()

            if (daftarPesanan.isNullOrEmpty()) {
                Toast.makeText(this, "Anda belum memesan apapun!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener // Hentikan proses
            }

            if (name.isEmpty() || address.isEmpty() || detail.isEmpty()) {
                Toast.makeText(this, "Lengkapi data pengiriman terlebih dahulu!", Toast.LENGTH_SHORT).show()
            } else {
                // Bersihkan keranjang setelah berhasil pesan (opsional)
                sharedPref.edit().putString("ORDERED_ITEMS", "").apply()

                Toast.makeText(this, "Alamat dikonfirmasi! Memproses pesanan...", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, OrderConfirmationActivity::class.java))
                finish()
            }
        }
    }
}