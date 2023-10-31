package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.myapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val tabTitles = arrayListOf("FirebaseDB", "RoomDB")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpTabLayoutWithViewPager()

    }

    private fun setUpTabLayoutWithViewPager() {
        binding.viewPager.adapter = AdapterTab(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }


}