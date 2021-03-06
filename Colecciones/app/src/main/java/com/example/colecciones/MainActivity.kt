package com.example.colecciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.colecciones.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.delay

/*
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
//hola*/
class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate((layoutInflater))
        val view = binding.root // devuelve el Linetlayout
        setContentView(view)
        inicio(view)

    }

    private fun inicio(view : View) {

        lifecycleScope.launchWhenStarted {
            binding.progressm.isVisible =true
            delay(3000)
            binding.progressm.isVisible=false
        }

        binding.btnM.setOnClickListener {
            binding.ivM.visibility = View.VISIBLE
            if (!binding.etM.text.isEmpty()) {
                Toast.makeText(this, binding.etM.text, Toast.LENGTH_SHORT).show()
                binding.tvM.text=binding.etM.text
            } else
                Toast.makeText(this, "El campo es nulo", Toast.LENGTH_SHORT).show()

        }
        MaterialAlertDialogBuilder(view.context)
            .setTitle("My dialog")
            .setMessage(("Este es un dialogo con MD3"))
            .setNeutralButton("Cancelar"){dialog, which->

            }
            .setNegativeButton("Rechazar"){dialog, which->

            }
            .setPositiveButton("Aceptar"){dialog, which->

            }
            .show()

    }


}