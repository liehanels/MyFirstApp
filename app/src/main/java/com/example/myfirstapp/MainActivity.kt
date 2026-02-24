package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//ViewCompat
        //Code goes below here
        //Declarations
        //UI Elements
        //constant constName = findViewById<ElementType>(WhereToFindElement.WhatWeWantToFind.ElementID)
        val tvTitle = findViewById<TextView>(R.id.tvMainTitle)
        val edtName = findViewById<EditText>(R.id.edtTextMainName)
        val edtAge = findViewById<EditText>(R.id.edtNumMainAge)
        val btnConfirm = findViewById<Button>(R.id.btnMainConfirm)
        //Variables and Constants
        //variable varName: DataType (optional) = Value
        var name: String = "User"
        var age: Int = 0
        //constant valName: DataType = Value
        val greet: String = "Hello, " // Cannot be changed
        //Logic
        //Button click
        btnConfirm.setOnClickListener()//tap the button
        {
            //varName = ElementWhereTheValueIsStored.WhereToFindTheValue.ConvertToString()(optional).convertToOtherDataType()
            //Get inputs from elements and store them in variables
            name = edtName.text.toString()
            age = edtAge.text.toString().toInt()
            //Process information
            tvTitle.text = "$greet $name"
            Toast.makeText(this, "$age years old", Toast.LENGTH_SHORT).show()
            edtName.text.clear()
            edtAge.text.clear()
        }//btnConfirm.setOnClickListener
        //Code goes above here
    }//override fun onCreate
}//class MainActivity
//data classes go here
