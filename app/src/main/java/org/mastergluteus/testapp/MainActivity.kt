package org.mastergluteus.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actvity_sticazzi.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.actvity_sticazzi)
    }

    override fun onStart() {
        super.onStart()

        val poesia = LocalPoemProvider.getPoem()
        poem_field.text = poesia
    }
}