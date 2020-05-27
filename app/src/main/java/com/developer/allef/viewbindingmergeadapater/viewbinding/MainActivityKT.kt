package com.developer.allef.viewbindingmergeadapater.viewbinding

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.developer.allef.viewbindingmergeadapater.R
import com.developer.allef.viewbindingmergeadapater.databinding.ActivityMainktBinding
import kotlinx.android.synthetic.main.activity_mainjv.*
import kotlinx.android.synthetic.main.activity_mainkt.*

class MainActivityKT : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainktBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Agenda"

        binding.btnAgenda.setOnClickListener {
            startActivity(Intent(this,MainActivityJV::class.java))
            finish()
        }

    }
}
