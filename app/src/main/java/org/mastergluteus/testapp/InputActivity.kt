package org.mastergluteus.testapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actvity_main.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_main)

        setupButton()
    }

    private fun setupButton() {
        button_continue.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            val testoUtente = text_input.text.toString()
            intent.putExtra("TESTO_EXTRA", testoUtente)

            startActivity(intent)
        }
    }

}