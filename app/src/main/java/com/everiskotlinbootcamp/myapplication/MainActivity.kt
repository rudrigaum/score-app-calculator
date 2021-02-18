package com.everiskotlinbootcamp.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular : Button = calculate
        val result : TextView = result

        btCalcular.setOnClickListener {

            val note1: Int = Integer.parseInt(note1.text.toString())
            val note2: Int = Integer.parseInt(note2.text.toString())
            val media: Int = (note1 + note2) / 2
            val absences:Int = Integer.parseInt(absences.text.toString())

            if(media >=6 && absences <= 10){
                result.setText("Student was approved" + "\n" + "Final Score: " + media + "\n" + "Absences: " + absences )
                result.setTextColor(Color.GREEN)
            }
            else{
                result.setText("Student was disapproved" + "\n" + "Final Score: " + media + "\n" + "Absences: " + absences )
                result.setTextColor(Color.RED)
            }

        }

    }
}