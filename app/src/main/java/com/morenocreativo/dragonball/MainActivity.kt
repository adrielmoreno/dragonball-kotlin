package com.morenocreativo.dragonball

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var initTime = 0L
    companion object {
        const val TAG_TIME = "TAG_TIME"
    }
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

        with(getPreferences(Context.MODE_PRIVATE)) {
            val pastTime = getLong(TAG_TIME, 0L)
            val editablePreferences = edit()
            editablePreferences.putLong(TAG_TIME, timeUsed + pastTime)
            editablePreferences.apply()
        }
        super.onStop()
    }
}