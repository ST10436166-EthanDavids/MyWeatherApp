package za.ac.iie.myweatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.Any
import kotlin.Any as Any1

class DetailsActivity : AppCompatActivity() {
    private lateinit var dayDetails: TextView
    // Initialize other TextViews for detailed information


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        dayDetails = findViewById(R.id.day_details)
        // Initialize other TextViews

        val days = intent.getStringArrayExtra("days")
        val temperatures = intent.getIntArrayExtra("temperatures")

        // Display detailed information
        if (days != null && temperatures != null) {
            dayDetails.text = "Day 1: ${days[0]}, Temperature: ${temperatures[0]}"
            // Set other details
        }

        val btnBack: Button = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            finish()




    }


        }
    }






