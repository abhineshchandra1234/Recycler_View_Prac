package com.eegrab.recyclerviewprac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        buttonPrevious.setOnClickListener {
            val dashboardIntent = Intent(this, MainActivity::class.java)
            startActivity(dashboardIntent)
        }

    }
}