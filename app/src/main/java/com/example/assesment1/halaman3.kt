package com.example.assesment1

import android.content.Intent
import android.os.Bundle
import android.content.Context
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class halaman3 : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman3)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.sandi)
        loginButton = findViewById(R.id.login)
        registerTextView = findViewById(R.id.signin)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Implementasikan logika otentikasi sesuai kebutuhan aplikasi Anda.
            // Misalnya, validasi data, panggilan API untuk otentikasi, dsb.

            // Jika otentikasi berhasil, alihkan ke halaman lain (misalnya, halaman5)
            if (authenticateUser(username, password)) {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            } else {
                // Menampilkan pesan kesalahan jika otentikasi gagal
                Toast.makeText(this, "Login gagal. Cek kembali username dan password.", Toast.LENGTH_SHORT).show()
            }
        }

        // Mengganti fungsi onClick untuk navigasi ke halaman registrasi (halaman4)
        registerTextView.setOnClickListener {
            signInClick()
        }

        usernameEditText.setOnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_NEXT || (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_DOWN)) {
                passwordEditText.requestFocus()
                true
            } else {
                false
            }
        }

        passwordEditText.setOnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE || (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_DOWN)) {
                loginButton.performClick()
                true
            } else {
                false
            }
        }
    }

    private fun authenticateUser(username: String, password: String): Boolean {
        // Implementasikan logika otentikasi sesuai dengan kebutuhan aplikasi Anda.
        // Gantilah ini dengan cara yang sesuai dengan aplikasi Anda
        val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val savedUsername = sharedPref.getString("username", "")
        val savedPassword = sharedPref.getString("password", "")

        Log.d("SharedPreferences", "Saved Username: $savedUsername")
        Log.d("SharedPreferences", "Saved Password: $savedPassword")

        return username == savedUsername && password == savedPassword
    }

    private fun signInClick() {
        val intent = Intent(this, halaman4::class.java)
        startActivity(intent)
    }
}
