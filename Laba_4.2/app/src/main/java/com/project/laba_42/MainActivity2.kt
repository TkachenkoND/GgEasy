package com.project.laba_42

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.laba_42.databinding.ActivityMain2Binding

const val THIEF = "THIEF"

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickListener()

    }

    private fun initClickListener() {
        binding.apply {
            radioGroup.setOnCheckedChangeListener { _, id ->
                val answerIntent = Intent()
                when (id) {
                    R.id.radio1 -> answerIntent.putExtra(THIEF, "Песик")
                    R.id.radio2 -> answerIntent.putExtra(THIEF, "Ворона")
                    R.id.radio3 -> answerIntent.putExtra(THIEF, "Кінь")
                }

                setResult(RESULT_OK, answerIntent)
                finish()
            }
        }
    }
}