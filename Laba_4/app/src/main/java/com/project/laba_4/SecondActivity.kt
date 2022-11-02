package com.project.laba_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.laba_4.databinding.ActivityScrollingBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initTextView()
    }

    private fun initTextView() {
        var user = "No Name"
        var info = "Info"
        var sender = "No Name"

        user = intent.getStringExtra("userName").toString()
        info = intent.getStringExtra("info").toString()
        sender = intent.getStringExtra("sender").toString()

        binding.apply {
            textContent.text = "$user вам передали $info\n Від: $sender"
        }
    }
}