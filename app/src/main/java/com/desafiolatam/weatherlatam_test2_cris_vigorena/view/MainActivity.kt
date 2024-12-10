package com.desafiolatam.weatherlatam_test2_cris_vigorena.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.desafiolatam.weatherlatam_test2_cris_vigorena.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}