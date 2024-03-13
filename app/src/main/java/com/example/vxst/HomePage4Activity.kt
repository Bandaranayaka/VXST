package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomePage4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page4)


            val accBtn: Button = findViewById(R.id.FundButton)
            accBtn.setOnClickListener {
            val intent = Intent(this, DebetCardActivity::class.java)
            startActivity(intent)
            finish()
            }

            val imageView: ImageView = findViewById(R.id.TransactionBtn)
            imageView.setOnClickListener {
            val intent = Intent(this, TransactionPage::class.java)
            startActivity(intent)
            finish()
            }

            val imageView4: ImageView = findViewById(R.id.BankTransferBtn)
            imageView4.setOnClickListener {
             val intent = Intent(this, BankTransferActivity::class.java)
            startActivity(intent)
            finish()
             }
    }
}

