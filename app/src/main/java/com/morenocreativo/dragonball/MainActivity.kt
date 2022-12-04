package com.morenocreativo.dragonball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var initTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_constraint)

    }

    override fun onStart() {
        super.onStart()
       initTime = System.currentTimeMillis()
    }

    override fun onStop() {
        val endTime = System.currentTimeMillis()
        val timeUsed = endTime - initTime

        super.onStop()

    }
}