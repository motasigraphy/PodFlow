package com.podflow.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val cardMateriel = findViewById<CardView>(R.id.cardMateriel)
        val cardStudio = findViewById<CardView>(R.id.cardStudio)
        val cardCrew = findViewById<CardView>(R.id.cardCrew)

        cardMateriel.setOnClickListener {
            startActivity(Intent(this, MaterielActivity::class.java))
        }

        cardStudio.setOnClickListener {
            startActivity(Intent(this, StudioActivity::class.java))
        }

        cardCrew.setOnClickListener {
            startActivity(Intent(this, CrewActivity::class.java))
        }
    }
}