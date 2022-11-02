package com.project.laba_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var mHelloTextView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mHelloTextView = findViewById(R.id.textView)
        val imageButton: ImageButton = findViewById(R.id.imageButton)

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                mHelloTextView.text = "Hello Kitty!";
            } else {
                mHelloTextView.text = "Привіт" + editText.text
            }
        }
    }
}