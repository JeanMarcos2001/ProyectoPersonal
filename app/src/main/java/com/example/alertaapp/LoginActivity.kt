package com.example.alertaapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class LoginActivity : AppCompatActivity() {

    var tvRegistro: TextView? = null
    private lateinit var tietCorreo: TextInputEditText
    private lateinit var tilCorreo: TextInputLayout
    private lateinit var tietClave: TextInputEditText
    private lateinit var tilClave: TextInputLayout





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        tvRegistro=findViewById(R.id.tvRegistro)
        tietCorreo=findViewById(R.id.tietCorreo)


        tvRegistro?.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            val correo : String = tietCorreo.text.toString()
            startActivity(intent)
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}