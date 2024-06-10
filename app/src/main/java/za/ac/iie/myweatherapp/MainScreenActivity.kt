package za.ac.iie.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call.Details
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainScreenActivity : AppCompatActivity() {

    private lateinit var editDay1: EditText
    private lateinit var editDay2: EditText
    private lateinit var editDay3: EditText
    private lateinit var editDay4: EditText
    private lateinit var editDay5: EditText
    private lateinit var editDay6: EditText
    private lateinit var editDay7: EditText
    private lateinit var avgTemperature: TextView

    private var temperatures = IntArray(7)
    private var days = arrayOf("", "", "", "", "", "", "")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editDay1 = findViewById(R.id.edit_day1)
        editDay1 = findViewById(R.id.edit_day2)
        editDay1 = findViewById(R.id.edit_day3)
        editDay1 = findViewById(R.id.edit_day4)
        editDay1 = findViewById(R.id.edit_day5)
        editDay1 = findViewById(R.id.edit_day6)
        editDay1 = findViewById(R.id.edit_day7)
        // Initialize other EditTexts

        avgTemperature = findViewById(R.id.avg_temperature)
        val btnClear: Button = findViewById(R.id.btn_clear)
        val btnViewDetails: Button = findViewById(R.id.btn_view_details)
        val btnExit: Button = findViewById(R.id.btn_exit)

        btnClear.setOnClickListener {
            clearData()
        }

        btnViewDetails.setOnClickListener {
            calculateAverageTemperature()
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("days", days)
            intent.putExtra("temperatures", temperatures)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finish()
        }
    }

    private fun clearData() {
        TODO("Not yet implemented")
    }

    private fun calculateAverageTemperature() {
        TODO("Not yet implemented")
    }


}

