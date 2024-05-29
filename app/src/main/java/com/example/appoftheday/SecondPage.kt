package com.example.appoftheday

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appoftheday.databinding.SecondPageBinding


class SecondPage : AppCompatActivity(){
    private lateinit var binding: SecondPageBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.GoBack.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}