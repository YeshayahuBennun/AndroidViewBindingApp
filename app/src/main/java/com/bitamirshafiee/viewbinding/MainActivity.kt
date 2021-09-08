package com.bitamirshafiee.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitamirshafiee.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}