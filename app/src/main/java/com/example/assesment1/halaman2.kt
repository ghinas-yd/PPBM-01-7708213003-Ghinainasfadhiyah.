package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.assesment1.halaman3
import com.example.assesment1.halaman4

class halaman2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)

        //1.definisikan button
        val btnmove = findViewById<Button>(R.id.masuk)
        val btnpindahhalaman = findViewById<Button>(R.id.daftar)

        btnmove.setOnClickListener {
            val _btnmove=
                Intent(this, halaman3::class.java)
            startActivity(_btnmove)
        }
        btnpindahhalaman.setOnClickListener {
            val _btnpindah1=
                Intent(this, halaman4::class.java)
            startActivity(_btnpindah1)
        }

    }
}