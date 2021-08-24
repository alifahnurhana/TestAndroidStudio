package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val correctUserName = "surya"
        val correctPassword = "123456"

        val textUserName = findViewById<EditText>(R.id.editTextTextPersonName2)
        val loginPassword = findViewById<EditText>(R.id.editTextTextPassword2)
        val textButton = findViewById<Button>(R.id.button_login)

        textButton.setOnClickListener {
            if(textUserName.text.toString ()== correctUserName &&
                    loginPassword.text.toString()==correctPassword) {
                Toast.makeText(this,"Sukses",Toast.LENGTH_SHORT).show ()
            }else{ Toast.makeText(this,"gagal masuk", Toast.LENGTH_SHORT).show()

         }

        }


    }


}