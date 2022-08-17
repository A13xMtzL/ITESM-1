package com.example.itesm_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // R objeto automaticamente creado
                                               // Y se llama el layout del nombre del archivo sin extension

        var myTxt:String

        var myTextView = findViewById<TextView>(R.id.textView)
        var myEditText=findViewById<EditText>(R.id.edit_text)
        var myButton =findViewById<Button>(R.id.button)

        myButton.setOnClickListener{
            myTxt=myEditText.text.toString()
            myTextView.text= myTxt
        }
    }
}