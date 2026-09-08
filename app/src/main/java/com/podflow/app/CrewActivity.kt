package com.podflow.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class CrewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crew)

        val cardMouatassime = findViewById<CardView>(R.id.cardMouatassime)

        cardMouatassime.setOnClickListener {
            val intent = Intent(this, CrewDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}