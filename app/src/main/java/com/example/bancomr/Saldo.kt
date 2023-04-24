package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityMainBinding
import com.example.bancomr.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {

    private lateinit var binding: ActivitySaldoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Para criar uma nova barra de ação, com o botão voltar e o nome da tela em que o usuário está, foi necessário esconder a barra de ação atual.

        supportActionBar!!.hide()

        val toolbar = binding.toolbarSaldo
        toolbar.title = "Saldo"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(400, 0, 400, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(R.drawable.ic_voltar)
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}