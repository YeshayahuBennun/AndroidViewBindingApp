package com.bitamirshafiee.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.bitamirshafiee.viewbinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.textView.text = resources.getString(R.string.str_text_view)
        binding.buttonMessage.setOnClickListener{
            Toast.makeText(this,resources.getText(R.string.str_button_is_clicked),Toast.LENGTH_SHORT).show()
        }
    }
}