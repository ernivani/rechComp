package fr.ernicani.rechcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var BattSize: String? = null // works


        val nextButton = findViewById<Button>(R.id.suivantButt)
        val BattSizeText = findViewById<TextView>(R.id.tailleBatt)

        nextButton.setOnClickListener {
            BattSize = BattSizeText.text.toString()
        }
    }
}