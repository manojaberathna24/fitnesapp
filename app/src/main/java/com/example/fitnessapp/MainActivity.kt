package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var dateTimeTextView: TextView
    private lateinit var timerButton: Button
    private lateinit var stepCounterButton: Button
    private lateinit var healthTipsButton: Button
    private lateinit var caloriesCalculatorButton: Button
    private lateinit var bmiCalculatorButton: Button
    private lateinit var torchButton: Button
    private lateinit var stopwatchButton: Button
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        dateTimeTextView = findViewById(R.id.dateTimeTextView)
        timerButton = findViewById(R.id.timerButton)
        stepCounterButton = findViewById(R.id.stepCounterButton)
        healthTipsButton = findViewById(R.id.healthTipsButton)
        caloriesCalculatorButton = findViewById(R.id.caloriesCalculatorButton)
        bmiCalculatorButton = findViewById(R.id.bmiCalculatorButton)
        torchButton = findViewById(R.id.torchButton)
        stopwatchButton = findViewById(R.id.stopwatchButton)

        // Start updating date and time
        updateDateTime()
        handler.postDelayed(object : Runnable {
            override fun run() {
                updateDateTime()
                handler.postDelayed(this, 1000)
            }
        }, 1000)

        // Set click listeners for each button
        timerButton.setOnClickListener {
            startActivity(Intent(this, TimerActivity::class.java))
        }

        stepCounterButton.setOnClickListener {
            startActivity(Intent(this, StepCounterActivity::class.java))
        }

        healthTipsButton.setOnClickListener {
            startActivity(Intent(this, HealthTipsActivity::class.java))
        }

        caloriesCalculatorButton.setOnClickListener {
            startActivity(Intent(this, CaloriesCalculatorActivity::class.java))
        }

        bmiCalculatorButton.setOnClickListener {
            startActivity(Intent(this, BmiCalculatorActivity::class.java))
        }

        torchButton.setOnClickListener {
            startActivity(Intent(this, activity_torch::class.java))
        }

        stopwatchButton.setOnClickListener {
            startActivity(Intent(this, activity_stopwatch::class.java))
        }
    }

    private fun updateDateTime() {
        val currentDateTime = SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.getDefault()).format(Date())
        dateTimeTextView.text = currentDateTime
    }
}
