package com.jihee.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jihee.memorygame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MainActivity,GameActivity::class.java))
        })

        binding.btnExit.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}