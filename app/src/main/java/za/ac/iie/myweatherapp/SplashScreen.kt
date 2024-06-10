package za.ac.iie.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton : Button = findViewById(R.id.startButton)
        val exitButton : Button = findViewById(R.id.exitButton)

        startButton.setOnClickListener {
            val  intent = Intent ( this, MainScreenActivity::class.java)
            startActivity(intent)
            finish()

        }

        exitButton.setOnClickListener {
            finish()
        }
    }
}

