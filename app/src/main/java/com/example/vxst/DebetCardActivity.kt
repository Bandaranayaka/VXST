package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DebetCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.debet_card6)

        val accBtn: Button = findViewById(R.id.FundAccountBtn)
        accBtn.setOnClickListener {
            val intent = Intent(this, FundSuccessFullActivity::class.java)
            startActivity(intent)
            finish()
        }

        val imageView4: ImageView = findViewById(R.id.BackDebetBtn)
        imageView4.setOnClickListener {
            val intent = Intent(this, HomePage4Activity::class.java)
            startActivity(intent)
            finish()
        }

    }
}

