package org.mastergluteus.testapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actvity_main.*

class MainActivity : AppCompatActivity(R.layout.actvity_main) {

    override fun onStart() {
        super.onStart()

        button_continue.setOnClickListener {
            navigateToDetail(text_input.text.toString())
        }
    }

    fun navigateToDetail(text: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.DETAIL_EXTRA_KEY, text)
        startActivity(intent)
    }
}