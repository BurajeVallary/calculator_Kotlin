package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    var etfirstvalue: EditText? = null
    var etsecondvalue: EditText? = null
    var btnadd: Button? = null
    var btnsub: Button? = null
    var btnmultiply: Button? = null
    var btnmodulas: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var tvresult: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etfirstvalue = findViewById(R.id.etfirstvalue)
        etsecondvalue = findViewById(R.id.etsecondvalue)
        btnadd = findViewById(R.id.btnadd)
        btnsub = findViewById(R.id.btnsub)
        btnmultiply = findViewById(R.id.btnmultiply )
        btnmodulas = findViewById(R.id.btnmodulas)
        tvresult = findViewById(R.id.tvresults)
        Clicklistener()
    }

    fun Clicklistener() {
        btnadd!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! + num2!!
            tvresult!!.text = result.toString()
        }
        btnsub!!
            .setOnClickListener {
                num1 = etfirstvalue!!.text.toString().toDouble()
                num2 = etsecondvalue!!.text.toString().toDouble()
                val result = num1!! - num2!!
                tvresult!!.text = result.toString()
            }
        btnmultiply!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! * num2!!
            tvresult!!.text = result.toString()
        }
        btnmodulas!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! / num2!!
            tvresult!!.text = result.toString()
        }
    }
}

