package com.example.question1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btAdd: Button = findViewById(R.id.btAdd)
        val btSubtract: Button = findViewById(R.id.btSubtract)
        val btMultiply: Button = findViewById(R.id.btMultiply)
        val btDivide: Button = findViewById(R.id.btDivide)
        val edtxt1: EditText = findViewById(R.id.ednum1)
        val edtxt2: EditText = findViewById(R.id.ednum2)
        val resultTV: TextView = findViewById(R.id.textResult)

        val clickListener = View.OnClickListener { v ->
            val x: Int = edtxt1.text.toString().toInt()
            val y: Int = edtxt2.text.toString().toInt()
            resultTV.text = when (v.id) {
                R.id.btAdd -> sum(x, y).toString()
                R.id.btSubtract -> subtract(x, y).toString()
                R.id.btMultiply -> multiply(x, y).toString()
                R.id.btDivide -> division(x, y).toString()
                else -> ""
            }
        }

        btAdd.setOnClickListener(clickListener)
        btSubtract.setOnClickListener(clickListener)
        btMultiply.setOnClickListener(clickListener)
        btDivide.setOnClickListener(clickListener)
    }

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    private fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    private fun division(a: Int, b: Int): Float {
        return a.toFloat() / b.toFloat()
    }

    private fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}
