package org.mastergluteus.testapp

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actvity_detail.*


class DetailActivity : AppCompatActivity(R.layout.actvity_detail) {

    companion object {
        const val DETAIL_EXTRA_KEY = "my_extra"
    }

    override fun onStart() {
        super.onStart()
        intent.getStringExtra(DETAIL_EXTRA_KEY)?.let {
            received_text.text = it
        }
    }

}