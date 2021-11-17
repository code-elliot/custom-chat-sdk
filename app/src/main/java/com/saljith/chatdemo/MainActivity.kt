package com.saljith.chatdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import chat.codebucket.`in`.activities.VerificationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)


        var btn = findViewById<Button>(R.id.button)
        var phone = findViewById<EditText>(R.id.phone)

        btn.setOnClickListener {
//            FirebaseInitProvider
//            FirebaseApp.initializeApp(this@MainActivity)
            val input = phone?.text.toString().trim()
            if (input.isNullOrBlank()) {
                //Your code for blank edittext
                Toast.makeText(this@MainActivity, "Enter Mobile Number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Intent(this, VerificationActivity::class.java).putExtra("phone", phone.text.toString()).apply {
                startActivity(this)
            }

        }
    }
}