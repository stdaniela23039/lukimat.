package com.stasoft.lukimat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.lukimat.databinding.ActivityCargaJuegoBinding
import com.stasoft.lukimat.databinding.ActivityPerfilBinding
import java.lang.Thread.sleep

class CargaJuegoActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityCargaJuegoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCargaJuegoBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_carga_juego)

       sleep(3000)

        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}