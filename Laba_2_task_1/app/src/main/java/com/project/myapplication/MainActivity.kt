package com.project.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickListener()
    }

    private fun initClickListener() {
        binding.apply {
            btnCount.setOnClickListener {
                setContent()
            }
        }
    }

    private fun setContent() {
        binding.apply {
            count++
            textCount.text = count.toString()
        }
    }

}