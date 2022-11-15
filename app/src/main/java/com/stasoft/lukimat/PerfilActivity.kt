package com.stasoft.lukimat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.lukimat.databinding.ActivityPerfilBinding


class PerfilActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonmenu.setOnClickListener() {
            val intent2 = Intent(this, CargaJuegoActivity::class.java)
            startActivity(intent2)
        }
    }

}