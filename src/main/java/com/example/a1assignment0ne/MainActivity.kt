package com.example.a1assignment0ne

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val timeInput = findViewById<EditText>(R.id.timeInput)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val ImageView = findViewById<ImageView>(R.id.imageView)
        val submitButton = findViewById<Button>(R.id.submitButton)


        // Set click listener for submit button
        resetButton.setOnClickListener {
            timeInput.text.clear() // Clears the text


            submitButton.setOnClickListener {
                val timeInput = timeInput.text.toString().trim().toLowerCase()

                when (timeInput) {
                    "morning" -> {
                        ImageView.setImageResource(R.drawable.breakfast2)
                        ImageView.visibility = View.VISIBLE
                    }

                    "afternoon" -> {

                        ImageView.setImageResource(R.drawable.lunch1)
                        ImageView.visibility = View.VISIBLE
                    }

                    "night" -> {

                        ImageView.setImageResource(R.drawable.dinner1)
                        ImageView.visibility = View.VISIBLE
                    }

                    else -> {
                        Toast.makeText(
                            this ,
                            "Please enter 'morning', 'afternoon', or 'night'" ,
                            Toast.LENGTH_SHORT
                        ).show()

                    }
                }
            }

            // Set click listener for reset button
            resetButton.setOnClickListener {
                ImageView.visibility = View.GONE
            }
        }
    }
    }

