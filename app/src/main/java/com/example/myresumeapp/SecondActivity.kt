package com.example.myresumeapp

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myresumeapp.R
import com.example.myresumeapp.ThirdActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var skillsEditText: EditText
    private lateinit var summaryEditText: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nameEditText = findViewById(R.id.name_edit_text)
        emailEditText = findViewById(R.id.email_edit_text)
        phoneEditText = findViewById(R.id.phone_edit_text)
        skillsEditText = findViewById(R.id.skills_edit_text)
        summaryEditText = findViewById(R.id.summary_edit_text)
        saveButton = findViewById(R.id.save_button)

        val addEducationButton = findViewById<Button>(R.id.add_education_button)
        val addWorkExperienceButton = findViewById<Button>(R.id.add_work_experience_button)
        val addProjectsButton = findViewById<Button>(R.id.add_projects_button)
        val addCertificationsButton = findViewById<Button>(R.id.add_certifications_button)

        addEducationButton.setOnClickListener {
            showAddDialog("Add Education")
        }

        addWorkExperienceButton.setOnClickListener {
            showAddDialog("Add Work Experience")
        }

        addProjectsButton.setOnClickListener {
            showAddDialog("Add Projects")
        }

        addCertificationsButton.setOnClickListener {
            showAddDialog("Add Certifications")
        }

        saveButton.setOnClickListener {
            saveUserData()
            navigateToThirdActivity()
        }
    }

    private fun showAddDialog(title: String) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_edit_text)
        dialog.setTitle(title)

        val addButton = dialog.findViewById<Button>(R.id.add_button)
        val editText = dialog.findViewById<EditText>(R.id.dialog_edit_text)

        addButton.setOnClickListener {
            val data = editText.text.toString().trim()
            if (data.isNotEmpty()) {
                Toast.makeText(this, "Added: $data", Toast.LENGTH_SHORT).show()
                editText.text.clear()
            } else {
                Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
            }
        }

        dialog.show()
    }

    private fun saveUserData() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val phone = phoneEditText.text.toString()
        val skills = skillsEditText.text.toString()
        val summary = summaryEditText.text.toString()

        // Process the data as needed (e.g., save to database, display in UI)
        val userData = "Name: $name\nEmail: $email\nPhone: $phone\nSkills: $skills\nSummary: $summary"
        Toast.makeText(this, userData, Toast.LENGTH_LONG).show()

        // Navigate to the next activity
        val intent = Intent(this, ThirdActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("phone", phone)
        intent.putExtra("skills", skills)
        intent.putExtra("summary", summary)
        startActivity(intent)
    }

    private fun navigateToThirdActivity() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val phone = phoneEditText.text.toString()
        val skills = skillsEditText.text.toString()
        val summary = summaryEditText.text.toString()

        val intent = Intent(this, ThirdActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("phone", phone)
        intent.putExtra("skills", skills)
        intent.putExtra("summary", summary)
        startActivity(intent)
    }
}
