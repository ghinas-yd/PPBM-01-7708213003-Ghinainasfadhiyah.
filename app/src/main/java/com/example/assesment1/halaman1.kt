package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halaman1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman1)

        //1.definisikan button
        val btn_pindah = findViewById<Button>(R.id.started)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, halaman2::class.java)
            startActivity(_intentPindah)
        }
    }
}