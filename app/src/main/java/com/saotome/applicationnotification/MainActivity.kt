package com.saotome.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var enviarNotificacaoBotao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enviarNotificacaoBotao = findViewById(R.id.enviar_notificacao_botao)

        enviarNotificacaoBotao.setOnClickListener {
            this.showNotification("1234", "Bootcamp Android", "Kotlin Android Curso")
        }
    }
}