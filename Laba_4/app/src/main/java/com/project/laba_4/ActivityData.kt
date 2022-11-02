package com.project.laba_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.laba_4.databinding.ActivityDataBinding

class ActivityData : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}