package com.example.assesment1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.assesment1.R
import com.example.assesment1.halaman6
import com.example.assesment1.halaman8
import com.example.assesment1.halaman9
import com.example.assesment1.menu2d

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman5)

        val videografiButton = findViewById<View>(R.id.videografi)
        val settingButton = findViewById<View>(R.id.setting)
        val duaButton = findViewById<View>(R.id.dua)
        val tigaButton = findViewById<View>(R.id.tiga)
        val backButton = findViewById<View>(R.id.back)

        videografiButton.setOnClickListener {
            // Navigasi ke halaman VideografiActivity ketika tombol "Videografi" ditekan
            val intent = Intent(this, halaman8::class.java)
            startActivity(intent)
        }

        settingButton.setOnClickListener {
            // Navigasi ke halaman SettingActivity ketika tombol "Setting" ditekan
            val intent = Intent(this, halaman9::class.java)
            startActivity(intent)
        }

        duaButton.setOnClickListener {
            // Navigasi ke halaman DuaDimensiActivity ketika tombol "2D" ditekan
            val intent = Intent(this, menu2d::class.java)
            startActivity(intent)
        }

        tigaButton.setOnClickListener {
            // Navigasi ke halaman TigaDimensiActivity ketika tombol "3D" ditekan
            val intent = Intent(this, halaman6::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            // Navigasi ke halaman sebelumnya (jika Anda ingin menambahkan tombol kembali)
            onBackPressed()
        }
    }
}
