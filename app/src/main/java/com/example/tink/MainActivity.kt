package com.example.tink

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.uikittink.CardCount
import com.example.uikittink.CardCountBut
import com.example.uikittink.CardCountMin
import com.example.uikittink.TinTextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s = findViewById<CardCount>(R.id.card)
        val ss = findViewById<CardCountMin>(R.id.card_min)
        val sss = findViewById<CardCountBut>(R.id.card_but)


    }
}