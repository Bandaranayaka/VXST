package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FundSuccessFullActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.successfull_page7)

        val accBtn: Button = findViewById(R.id.investBtn)
        accBtn.setOnClickListener {
            val intent = Intent(this, DangotActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}