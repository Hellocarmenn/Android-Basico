package com.example.colecciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    //Agregando codigo
    val TAG ="Miactividad"
    lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv_m)

        val button: Button = findViewById(R.id.btn_m)
        val editText: EditText = findViewById(R.id.et_m)
        val image: ImageView = findViewById(R.id.iv_m)


        button.setOnClickListener {
            image.visibility = View.VISIBLE
            if (!editText.text.isEmpty()) {
                Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
                textView.text=editText.text
            } else
                Toast.makeText(this, "El campo es nulo", Toast.LENGTH_SHORT).show()

        }
    }

    }
//hola