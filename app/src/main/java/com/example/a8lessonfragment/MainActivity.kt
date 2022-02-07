package com.example.a8lessonfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.a8lessonfragment.adapter.ViewPagerAdapter
import com.example.a8lessonfragment.page.Page1
import com.example.a8lessonfragment.page.page2
import com.example.a8lessonfragment.page.page3
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    var viewPagerAdapter: ViewPagerAdapter? = null
    val viewPager: ViewPager? = null
    var tabLayout: TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.view_pager)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter!!.add(Page1(), "Pager1")
        viewPagerAdapter!!.add(page2(), "Pager2")
        viewPagerAdapter!!.add(page3(), "Pager3")

        viewPager.setAdapter(viewPagerAdapter)

        tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        tabLayout!!.setupWithViewPager(viewPager)
    }
    }
