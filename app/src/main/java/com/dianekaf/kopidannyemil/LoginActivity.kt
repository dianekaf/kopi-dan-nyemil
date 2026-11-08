package com.dianekaf.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etLoginUsername)
        val etPassword = findViewById<EditText>(R.id.etLoginPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack?.setOnClickListener { finish() }

        btnLogin.setOnClickListener {
            val usernameInput = etUsername.text.toString().trim()
            val passwordInput = etPassword.text.toString().trim()

            if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
                Toast.makeText(this, "Username dan Password tidak boleh kosong!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val sharedPref = getSharedPreferences("UserPref", MODE_PRIVATE)
            val savedUser = sharedPref.getString("SAVED_USERNAME", "")
            val savedPass = sharedPref.getString("SAVED_PASSWORD", "")

            val isDefaultAdmin = (usernameInput == "dian09" && passwordInput == "123456")
            val isRegisteredUser = (usernameInput == savedUser && passwordInput == savedPass && !savedUser.isNullOrEmpty())

            if (isDefaultAdmin || isRegisteredUser) {
                Toast.makeText(this, "Login Berhasil! Selamat datang, $usernameInput", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Login Gagal! Username atau Password salah.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}