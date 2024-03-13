package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AmountPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.amount_page11)

        val accBtn: Button = findViewById(R.id.ProceedButton)
        accBtn.setOnClickListener {
            val intent = Intent(this, InvestSumarry::class.java)
            startActivity(intent)
            finish()
        }

        val imageView4: ImageView = findViewById(R.id.AmountBackBtn)
        imageView4.setOnClickListener {
            val intent = Intent(this, StockDetailActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

