package com.example.viewmodelwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewmodelwithfragment.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    val animalsArray = arrayOf(
        "One",
        "Two"

    )
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewPager = binding.pager
        tabLayout = binding.tabLayout
        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout,viewPager) { tab,position ->
            tab.text = animalsArray[position]
        }.attach()
    }
}

