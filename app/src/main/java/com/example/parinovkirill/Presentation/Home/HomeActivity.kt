package com.example.parinovkirill.Presentation.Home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.parinovkirill.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val fragmentsList = listOf(
            HomeFragment.newInstance(),
            InfoFragment.newInstance(),
            SettingsFragment.newInstance()
        )
        val vpAdapter = ViewPagerAdapter(this, fragmentsList)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tb)
        viewPager.adapter = vpAdapter

        TabLayoutMediator(tabLayout, viewPager) {
            tab, pos ->
        }.attach()

    }
}