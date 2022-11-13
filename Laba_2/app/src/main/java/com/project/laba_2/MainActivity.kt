package com.project.laba_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.project.laba_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickListener()
    }

    private fun initClickListener() {
        binding.apply {
            btnRed.setOnClickListener {
                setContent(1)
            }
            btnYellow.setOnClickListener {
                setContent(2)
            }
            btnGreen.setOnClickListener {
                setContent(3)
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun setContent(index: Int) {
        binding.apply {
            when (index) {
                1 -> {
                    text.text = "Red"
                    root.setBackgroundResource(R.color.red)
                }
                2 -> {
                    text.text = "Yellow"
                    root.setBackgroundColor(R.color.yellow)
                }
                3 -> {
                    text.text = "Green"
                    root.setBackgroundColor(R.color.green)
                }
            }
        }
    }


}