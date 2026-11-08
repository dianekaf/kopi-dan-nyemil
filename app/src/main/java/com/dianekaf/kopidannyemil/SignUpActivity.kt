package com.dianekaf.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnGoToRegister: Button = findViewById(R.id.btnGoToRegister)
        val btnGoToLogin: Button = findViewById(R.id.btnGoToLogin)
        val btnBack: Button? = findViewById(R.id.btnBack)

        btnBack?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        btnGoToRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        btnGoToLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}