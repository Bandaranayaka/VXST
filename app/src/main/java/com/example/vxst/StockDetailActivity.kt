package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StockDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stock_details_page10)


        val accBtn: Button = findViewById(R.id.DangotInvestBtn)
        accBtn.setOnClickListener {
            val intent = Intent(this, AmountPageActivity::class.java)
            startActivity(intent)
            finish()
        }

        val imageView4: ImageView = findViewById(R.id.ScokBackBtn)
        imageView4.setOnClickListener {
            val intent = Intent(this, DangotActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
