package com.techsultan.zuritasklistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techsultan.zuritasklistview.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            login()
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }
    }
    private fun login() {

        val email = binding.email.text.toString()
        val password = binding.password.text.toString()

        if (email.isEmpty()) {

           binding.email.error = "input your email address"
        }

        if (password.isEmpty()) {

            binding.email.error = "input your password"

        }


    }


    override fun onDestroy() {
        super.onDestroy()
        binding

    }


    }
