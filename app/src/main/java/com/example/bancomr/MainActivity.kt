package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgsaldo = binding.saldo
        imgsaldo.setOnClickListener {

            //As informações dentro dos parênteses significam a Activity atual, ou seja a MainActivity, e a Activity na qual irá navegar.
            //Intent é uma classe que possibilita navegar de uma tela para outra, possibilita navegar de uma Activity para outra.

            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }

        val imgfatura = binding.fatura
        imgfatura.setOnClickListener {
            val intent = Intent(this, Fatura::class.java)
            startActivity(intent)
            finish()
        }

        val imgtransferencia = binding.transferencia
        imgtransferencia.setOnClickListener {
            val intent = Intent(this, Transferencia::class.java)
            startActivity(intent)
            finish()
        }

        val imgpoupanca = binding.poupanca
        imgpoupanca.setOnClickListener {
            val intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
            finish()
        }
    }
}