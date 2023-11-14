package de.syntaxinstitut.liveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Layout wird geladen
        setContentView(R.layout.activity_main)
    }
}