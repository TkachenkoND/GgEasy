package com.project.laba_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.laba_3.databinding.ActivityMainBinding
import kotlin.random.Random

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
            img4.setOnClickListener {
                val phrases = listOf(
                    "Уже 6 часов утра, Наташ",
                    "Вставай, мы там все уронили",
                    "Мы уронили вообще все,Наташ, честно",
                    "Наташ, ты че опять лежишь?",
                    "Нас кормить пора",
                    "Будильник то, три раза звонил?",
                    "На работу опоздаешь"
                )
                val shuffledList = phrases.shuffled()

                txt1.text = shuffledList[0]
                txt2.text = shuffledList[1]
                txt4.text = shuffledList[2]
            }
        }
    }

}