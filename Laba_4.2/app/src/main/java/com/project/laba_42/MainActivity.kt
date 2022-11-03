package com.project.laba_42

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.laba_42.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val REQUEST_CHOOSE_THIEF = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickListener()
    }

    private fun initClickListener() {
        binding.apply {
            btnGoNextActivity.setOnClickListener {
                val questIntent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivityForResult(questIntent, REQUEST_CHOOSE_THIEF)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK){
            when(resultCode){
                REQUEST_CHOOSE_THIEF -> {
                    val name = data?.getStringExtra(THIEF)
                    binding.resultName.text = name.toString()
                }
            }
        } else {
            binding.resultName.text = "No Name"
        }
    }
}