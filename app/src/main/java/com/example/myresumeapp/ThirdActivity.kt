package com.example.myresumeapp

import com.example.myresumeapp.UserData
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        // Retrieve user data from intent extras
        val userData = intent.getSerializableExtra("userData") as com.example.myresumeapp.UserData

        // Display user data in TextViews
        findViewById<TextView>(R.id.personal_info_text).text = "Name: ${userData.name}\nEmail: ${userData.email}\nPhone: ${userData.phone}"
        findViewById<TextView>(R.id.education_text).text = userData.education
        findViewById<TextView>(R.id.work_experience_text).text = userData.workExperience
        findViewById<TextView>(R.id.projects_text).text = userData.projects
        findViewById<TextView>(R.id.certifications_text).text = userData.certifications
        findViewById<TextView>(R.id.skills_text).text = userData.skills
        findViewById<TextView>(R.id.summary_text).text = userData.summary
    }
}
