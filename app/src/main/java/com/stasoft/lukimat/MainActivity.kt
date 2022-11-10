package com.stasoft.lukimat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.lukimat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIniciar.setOnClickListener(){
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }

    }
}