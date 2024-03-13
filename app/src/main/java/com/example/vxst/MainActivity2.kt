package com.example.vxst

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val getButton = findViewById<View>(R.id.Getbutton)
        val getStart = findViewById<View>(R.id.getStart)

             //------------------------------------
        // Set OnClickListener to the button
            getButton.setOnClickListener {
            // Create an Intent to navigate to the login_page2 activity
            val intent = Intent(this@MainActivity2, LoginPage2Activity::class.java)
            startActivity(intent) // Start the activity
           //---------------
            // Set OnClickListener to the button
            getStart.setOnClickListener {
                // Create an Intent to navigate to the login_page2 activity
                val intent = Intent(this@MainActivity2, SignUpActivity::class.java)
                startActivity(intent) // Start the activity
            ///-----------------

        }
    }
}

}