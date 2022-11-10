package com.stasoft.lukimat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.lukimat.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_registro)

        binding.buttonusuario.setOnClickListener{
            val intent = Intent(this,PerfilActivity::class.java)
            startActivity(intent)
        }

    }

}
