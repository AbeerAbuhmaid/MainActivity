package com.example.myfirstassigment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
  val cp = arrayOf("dress","Men's Suit","women's suit","T-shirt","Men's pants","Women's pants")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val resultTV: TextView = findViewById(R.id.textResult)

        val spinner= findViewById<Spinner>(R.id.spinner)
        val arrayAdapter= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,cp)

        spinner.adapter= arrayAdapter
        var flag:String="dress"
        button.setOnClickListener {

            if ( flag=== "dress") {
                resultTV.text = 35.toString();
            }
            if (flag ==="Men's Suit") {
                resultTV.text = 50.toString()
            }
            if (flag === "women's suit") {
                resultTV.text = 40.toString();
            }
            if (flag ==="T-shirt") {
                resultTV.text = 20.toString();
            }
            if (flag === "Men's pants") {
                resultTV.text = 18.toString();
            }
            if (flag ==="Women's pants") {
                resultTV.text = 18.toString();
            }
        }
        spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        }

    }
