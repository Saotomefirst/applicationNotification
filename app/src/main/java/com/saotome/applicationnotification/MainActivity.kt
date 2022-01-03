package com.saotome.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    lateinit var enviarNotificacaoBotao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enviarNotificacaoBotao = findViewById(R.id.enviar_notificacao_botao)

        enviarNotificacaoBotao.setOnClickListener {
            this.showNotification("1234", "Bootcamp Android", "Kotlin Android Curso")
        }

        Log.i("**NovoToken", FirebaseInstanceId.getInstance().token.toString())
    }
}