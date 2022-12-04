package com.morenocreativo.dragonball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_constraint)
        Log.v(MainActivity::class.java.name, "Prueba")
        var hola = "hola"
        println(hola)
    }
}