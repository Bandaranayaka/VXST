package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class InvestSumarry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inves_summary12)

        val accBtn: Button = findViewById(R.id.BtnInvest)
        accBtn.setOnClickListener {
            val intent = Intent(this, InvestSuccsesfull::class.java)
            startActivity(intent)
            finish()
        }


        val imageView4: ImageView = findViewById(R.id.summaryBackBtn)
        imageView4.setOnClickListener {
            val intent = Intent(this, AmountPageActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
