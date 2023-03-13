package com.example.pokemonactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner: Spinner = findViewById(R.id.spinner)
        val imageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)

        val pokemons = arrayOf("Selecione","Bulbassauro","Charmander","Squirtle")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapter: AdapterView<*>?, spinner: View?, position: Int, id: Long) {
                when(position) {
                    1 -> imageView.setImageResource(R.drawable.bulbassauro)
                    2 -> imageView.setImageResource(R.drawable.charmander)
                    3 -> imageView.setImageResource(R.drawable.squirtle)
                    else -> imageView.setImageDrawable(null)
                }
            }

            override fun onNothingSelected(adapter: AdapterView<*>?) {

            }


        }

    }


}