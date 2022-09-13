package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val Login : EditText = findViewById(R.id.Edit_Text_1)
        val Password : EditText = findViewById(R.id.Edit_Text_2)
        val Button : Button = findViewById(R.id.Button_1)

        Button.setOnClickListener {
            val login = Login.text.toString()
            val password = Password.text.toString()

            if (login == "ABC" && password == "12345") {
                Toast.makeText(this, "Proceed", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Wrong Password Or Username", Toast.LENGTH_SHORT).show()
            }
        }



    }
}