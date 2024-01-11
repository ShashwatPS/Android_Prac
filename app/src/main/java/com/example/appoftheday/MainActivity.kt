package com.example.appoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.appoftheday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.textTitle.text = "App of tomorrow"


        binding.buttonSetImage.setOnClickListener {
            binding.textTitle.text = "App of the Day"


            Glide
                .with(this)
                .load("https://image.tmdb.org/t/p/original/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg")
//            .centerCrop()
//            .placeholder(R.drawable.loading_spinner)
                .into(binding.imageDownloaded);

//            val drawable = ContextCompat.getDrawable(this, R.drawable.test2)
//            binding.imageDownloaded.setImageDrawable(drawable)
        }
    }
}