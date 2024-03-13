package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singup_page3)


        val accBtn: Button = findViewById(R.id.SingUpButton)
        accBtn.setOnClickListener {
            val intent = Intent(this, VerifyPageActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}