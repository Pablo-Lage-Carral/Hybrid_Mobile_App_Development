package com.example.aula_10_09_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val TextView = findViewById<TextView>(R.id.textView4)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(view : View){

                val  menssage = "Vai mudar a mensagem"

                showToast(menssage)

                TextView.text = menssage

            }

        })
    }

    private fun showToast(message : String){

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        Log.i('Button', 'O botão foi acionado')
    }
}