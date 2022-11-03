package com.project.laba_5

import android.app.Activity
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Surface
import com.project.laba_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var orientation: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private fun getScreenOrientation(): String {
        return when (resources.configuration.orientation) {
            Configuration.ORIENTATION_PORTRAIT -> "ORIENTATION_PORTRAIT"
            Configuration.ORIENTATION_LANDSCAPE -> "ORIENTATION_LANDSCAPE"
            else -> "nothing)"
        }
    }

    private fun isLandscapeMode(activity: Activity): Boolean {
        val width = activity.windowManager.defaultDisplay.width
        val height = activity.windowManager.defaultDisplay.height

        var isLandscape = width > height

        orientation = if (isLandscape)
            "ORIENTATION_LANDSCAPE"
        else
            "ORIENTATION_PORTRAIT"

        return isLandscape

    }

    private fun getRotateOrientation() = when (windowManager.defaultDisplay.rotation){
        Surface.ROTATION_0 -> "Не повертали"
        Surface.ROTATION_90 -> "Повернули на 90 градусів"
        Surface.ROTATION_180 -> "Повернули на 180 градусів"
        Surface.ROTATION_270 -> "Повернули на 90 градусів проти часової"
        else -> "Не зрозуміло("
    }
}