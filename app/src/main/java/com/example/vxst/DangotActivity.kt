package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DangotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.invest_page9)

        val imageView: ImageView = findViewById(R.id.DangtImg)
        imageView.setOnClickListener {
            val intent = Intent(this, StockDetailActivity::class.java)
            startActivity(intent)
            finish()
        }

        val imageView2: ImageView = findViewById(R.id.investHome)
        imageView2.setOnClickListener {
            val intent = Intent(this, HomePage4Activity::class.java)
            startActivity(intent)
            finish()
        }

        val imageView3: ImageView = findViewById(R.id.investBank)
        imageView3.setOnClickListener {
            val intent = Intent(this, BankTransferActivity::class.java)
            startActivity(intent)
            finish()
        }

        val imageView4: ImageView = findViewById(R.id.investTransact)
        imageView4.setOnClickListener {
            val intent = Intent(this, TransactionPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}
