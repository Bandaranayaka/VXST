package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BankTransferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bank_transfer5)

            val accBtn: Button = findViewById(R.id.CopyBtn)
            accBtn.setOnClickListener {
            val intent = Intent(this, HomePage4Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
