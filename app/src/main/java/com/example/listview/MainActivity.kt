package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayListView()
    }

    private fun displayListView() {
        //getting view from xml
        var listView = findViewById<ListView>(R.id.listview)

        //data
        var fruits =
            arrayOf("Mango", "Banana", "Papaya", "Guava", "Pineapple", "JackFruit", "Apple")


        //adaptor
        var arrayAdapter = ArrayAdapter(
            this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            fruits
        )

        //setting the adaptor to the view
        listView.adapter = arrayAdapter
    }
}