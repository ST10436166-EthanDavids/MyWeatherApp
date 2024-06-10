package za.ac.iie.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyUnitTesting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_unit_testing)

        package com.example.screentimemanager

        import org.junit.Assert.*
                import org.junit.Before
                import org.junit.Test
                import org.mockito.Mockito.*

        class MainActivityUnitTest {

            private lateinit var mainActivity: MainActivity

            @Before
            fun setUp() {
                mainActivity = MainActivity()
            }

            @Test
            fun validateUserInput_validInput_returnsTrue() {
                // Mock the EditTexts and their text content
                val mockEditText = mock(EditText::class.java)
                `when`(mockEditText.text).thenReturn("Monday,12,20".toEditable())
                mainActivity.editDay1 = mockEditText

                // Assuming other EditTexts are also valid
                assertTrue(mainActivity.validateUserInput())
            }

            @Test
            fun validateUserInput_emptyInput_returnsFalse() {
                // Mock the EditTexts with empty text
                val mockEditText = mock(EditText::class.java)
                `when`(mockEditText.text).thenReturn("".toEditable())
                mainActivity.editDay1 = mockEditText

                // Assuming other EditTexts are also empty
                assertFalse(mainActivity.validateUserInput())
            }

            @Test
            fun validateUserInput_invalidFormat_returnsFalse() {
                // Mock the EditTexts with invalid format text
                val mockEditText = mock(EditText::class.java)
                `when`(mockEditText.text).thenReturn("Monday-12-20".toEditable())
                mainActivity.editDay1 = mockEditText

                // Assuming other EditTexts are also invalid
                assertFalse(mainActivity.validateUserInput())
            }

            @Test
            fun calculateAverageTemperature_correctCalculation() {
                // Set the mocked days array
                mainActivity.days = arrayOf(
                    "Monday,12,20",
                    "Tuesday,15,25",
                    "Wednesday,10,22",
                    "Thursday,18,30",
                    "Friday,17,27",
                    "Saturday,14,26",
                    "Sunday,13,24"
                )

                // Invoke the method to calculate average temperature
                mainActivity.calculateAverageTemperature()

                // Verify the calculated average temperature
                val expectedAverage = (20 + 25 + 22 + 30 + 27 + 26 + 24) / 7.0
                assertEquals(expectedAverage, mainActivity.avgTemperature.text.toString().replace("Average Temperature: ", "").toDouble(), 0.01)
            }
        }

        // Extension function to convert string to editable
        fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

    }
}