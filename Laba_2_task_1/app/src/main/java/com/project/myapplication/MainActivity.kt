package com.project.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var countCat = 0
    private var countGrach = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickListener()
    }

    private fun initClickListener() {
        binding.apply {
            btnCountCat.setOnClickListener {
                setCountCat()
            }

            btnCountGrach.setOnClickListener {
                setCountGrach()
            }
        }
    }

    private fun setCountCat() {
        binding.apply {
            countCat++
            textCountCat.text = countCat.toString()
        }
    }

    private fun setCountGrach() {
        binding.apply {
            countGrach++
            textCountGrach.text = countGrach.toString()
        }
    }

}