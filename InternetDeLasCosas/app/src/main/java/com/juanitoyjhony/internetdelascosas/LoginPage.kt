package com.juanitoyjhony.internetdelascosas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        val ButtonRegister=findViewById<Button>(R.id.ButtonRegister)
        ButtonRegister.setOnClickListener {
            val IntentRegister= Intent(this, Register::class.java)
            startActivity(IntentRegister)
        }
    }
}