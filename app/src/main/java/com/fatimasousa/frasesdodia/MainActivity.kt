package com.fatimasousa.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "O ignorante afirma, o sábio duvida, o sensato reflete.",
        "Se a tranquilidade da água permite refletir as coisas, o que não poderá a tranquilidade do espírito?",
        "Tente mover o mundo – o primeiro passo será mover a si mesmo.",
        "Não corrigir nossas falhas é o mesmo que cometer novos erros."
    )
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView
        button = findViewById(R.id.button) as Button


        button.setOnClickListener {
            gerarFrase()
        }
    }


    private fun gerarFrase() {

        val totalIntensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalIntensArray)

        texto.setText( frases[ numeroAleatorio ])

    }


}