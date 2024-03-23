package com.example.myresumeapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val createResumeButton = findViewById<Button>(R.id.createResumeButton)

        createResumeButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivity::class.java)
            startActivity(explicitIntent) // Start SecondActivity
        }
    }
}
