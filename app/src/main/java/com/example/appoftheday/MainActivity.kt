package com.example.appoftheday

import android.content.Intent
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
    private var cnt = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonSetImage.setOnClickListener{
//            Log.d("Messsage","The Button has been clicked");
//            if(cnt == 0) {
//                cnt = 1;
//                binding.imageDownloaded.setImageResource(R.drawable.test2);
//                val t1 = Toast.makeText(this, "The image has been set", Toast.LENGTH_LONG);
//                t1.show()
//            } else {
//                cnt =0;
//                binding.imageDownloaded.setImageResource(R.drawable.hga);
//                val t1 = Toast.makeText(this, "The image has been set to its default image", Toast.LENGTH_LONG);
//                t1.show()
//            }
            val intent: Intent = Intent(this,SecondPage::class.java);
            startActivity(intent)
        }
    }
}