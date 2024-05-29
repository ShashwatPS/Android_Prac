package com.example.appoftheday

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
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
        binding.button2.setOnClickListener{
            Glide
                .with(this)
                .load("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/fb15b135-4c0f-489f-a650-7eca92402f69/df170rm-7bd00fbe-4a01-41eb-b5a5-bd02ab575960.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2ZiMTViMTM1LTRjMGYtNDg5Zi1hNjUwLTdlY2E5MjQwMmY2OVwvZGYxNzBybS03YmQwMGZiZS00YTAxLTQxZWItYjVhNS1iZDAyYWI1NzU5NjAuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.43-O6ovsnwnLiLY2oEhbyn3YnMIttWagPgbvJUau_gk")
                .centerCrop()
                .into(binding.imageView);
        }
    }
}