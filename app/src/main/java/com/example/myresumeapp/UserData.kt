package com.example.myresumeapp

import java.io.Serializable

data class UserData(
    val name: String,
    val email: String,
    val phone: String,
    val education: String,
    val workExperience: String,
    val projects: String,
    val certifications: String,
    val skills: String,
    val summary: String
) : Serializable
