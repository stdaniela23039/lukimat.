package com.stasoft.lukimat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.lukimat.databinding.ActivityPerfilBinding
import com.stasoft.lukimat.databinding.ActivityRegistroBinding

class PerfilActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_perfil)

        binding.buttonmenu.setOnClickListener() {
            val intent = Intent(this, CargaJuegoActivity::class.java)
            startActivity(intent)
        }
    }

}