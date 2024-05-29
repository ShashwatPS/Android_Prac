package com.example.appoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.widget.Toast
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

        binding.buttonSetImage.setOnClickListener{
            Log.d("Messsage","The Button has been clicked");
            binding.imageDownloaded.setImageResource(R.drawable.test2);
            val t1 = Toast.makeText(this,"The image has been set",Toast.LENGTH_LONG);
            t1.show()
        }
    }
}