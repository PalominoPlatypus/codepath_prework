package com.example.helloworld_stevenpalomino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button to change the color of text at center of screen
        findViewById<Button>(R.id.button_textcolor).setOnClickListener {
            //when the button is clicked
            Log.i("tag_textcolor", "Tapped on button")//confirms that user has tapped on a button
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_700))


        }

        //button to change the color of the background to white
        findViewById<Button>(R.id.button_backgroundcolor).setOnClickListener {
            //when the button is clicked
            Log.i("tag_backgroundcolor", "Tapped on button")//confirms that user has tapped on a button

            findViewById<ConstraintLayout>(R.id.test).setBackgroundColor(getResources().getColor(R.color.white))
            print("hello")

        }


    }
}