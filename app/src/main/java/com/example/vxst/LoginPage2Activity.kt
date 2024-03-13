package com.example.vxst


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginPage2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page2)


        val accBtn: Button = findViewById(R.id.LoginBtn)
        accBtn.setOnClickListener {
            val intent = Intent(this, HomePage4Activity::class.java)
            startActivity(intent)
            finish()

        }
    }
}













