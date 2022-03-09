package com.example.compromise.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.compromise.R
import com.example.compromise.databinding.ActivityMainBinding
import com.example.compromise.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Compromise)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment.newInstance()).commit()
    }
}