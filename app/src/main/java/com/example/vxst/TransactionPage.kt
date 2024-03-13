package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TransactionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transaction_page8)

        val accBtn: Button = findViewById(R.id.TransacDoneBtn)
        accBtn.setOnClickListener {
            val intent = Intent(this, HomePage4Activity::class.java)
            startActivity(intent)
            finish()
        }


    }
}