package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.tvCount)
    }

    /**
     * Click Handler for Button
     */
    fun incrementClickCount(v: View?) {
        val currentClickCount: Int = editText.text.toString().toInt()
        editText.text = (currentClickCount+1).toString()
    }
}
