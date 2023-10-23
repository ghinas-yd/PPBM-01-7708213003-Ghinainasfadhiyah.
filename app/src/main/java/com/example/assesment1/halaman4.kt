package com.example.assesment1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import com.example.assesment1.R
import com.example.assesment1.halaman4

class halaman4 : AppCompatActivity() {

    private lateinit var createButton: View
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman4)

        createButton = findViewById(R.id.create)
        nameEditText = findViewById(R.id.regis)
        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)

        createButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Implementasikan logika validasi dan pendaftaran sesuai kebutuhan aplikasi Anda.
            if (isRegistrationValid(name, email, password)) {
                // Navigasi ke halaman lain (misalnya, halaman HomeActivity) ketika pendaftaran berhasil
                val intent = Intent(this, halaman3::class.java)
                startActivity(intent)
            } else {
                // Menampilkan pesan kesalahan jika pendaftaran gagal
                // Anda dapat menambahkan logika validasi tambahan di sini
            }
        }
    }

    // Implementasikan validasi pendaftaran sesuai dengan kebutuhan aplikasi Anda
    private fun isRegistrationValid(name: String, email: String, password: String): Boolean {
        // Gantilah ini dengan logika validasi yang sesuai dengan aplikasi Anda
        // Pastikan semua kondisi validasi terpenuhi
        return name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()
    }
}
