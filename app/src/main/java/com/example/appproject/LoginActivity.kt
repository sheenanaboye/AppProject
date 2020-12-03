package com.example.appproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.loginButton).setOnClickListener{ login() }
    }

    private fun login(){
        val username = findViewById<EditText>(R.id.usernameEditText).text
        val password = findViewById<EditText>(R.id.passwordEditText).text

        if(username.toString() =="Sheena" && password.toString() == "0000" ){
            Toast.makeText(this, "Hello $username", Toast.LENGTH_LONG).show()
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show()
        }
    }
}