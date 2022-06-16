package com.example.colecciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //Agregando codigo
    val TAG ="Miactividad"
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var name = "Carmen"
        Log.d(TAG,"Log de depuracion")
        Log.e(TAG,"Log de Error")
        Log.v(TAG,"Log de registro")
        Log.w(TAG,"Log de Advertencia")
        Log.i(TAG,"Log de informaciòn")
        name = "Ricardo"
    }

}
//hola