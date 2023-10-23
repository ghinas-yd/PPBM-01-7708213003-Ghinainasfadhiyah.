package com.example.assesment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class halaman9 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val profileButton = findViewById<Button>(R.id.profil)

        profileButton.setOnClickListener {
            // Tambahkan kode untuk menavigasi ke halaman profil
            // Misalnya, menggunakan Intent
            val intent = Intent(this, halaman10::class.java)
            startActivity(intent)
        }
    }
}