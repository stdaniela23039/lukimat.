package com.stasoft.lukimat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.lukimat.databinding.ActivityMenuBinding
import com.stasoft.lukimat.databinding.ActivityPerfilBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_menu)
        binding.buttonmenu.setOnClickListener() {
            val intent = Intent(this, CargaJuegoActivity::class.java)
            startActivity(intent)
        }
    }

}