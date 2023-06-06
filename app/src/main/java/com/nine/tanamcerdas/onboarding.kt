package com.nine.tanamcerdas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nine.tanamcerdas.databinding.ActivityOnboardingBinding

class onboarding : AppCompatActivity() {
    private lateinit var binding : ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGo.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}