package com.example.whatsappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsappproject.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var fragment = arrayListOf<Fragment>()
    val title = listOf("Chat", "Status", "Call")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var layout = arrayListOf(
            R.layout.fragment_chat,
            R.layout.fragment_status,
            R.layout.fragment_call
        )
        fragment.add(ChatFragment())
        fragment.add(StatusFragment())
        fragment.add(CallFragment())
        binding.Pagerview.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.Pagerview.adapter = TabAdapter(this, fragment)

        TabLayoutMediator(binding.tlTabLayoutview, binding.Pagerview) { tab, position ->
            tab.text = title[position]
        }
            .attach()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
     menuInflater.inflate(R.menu.side_menu, menu)
    return super.onCreateOptionsMenu(menu)
     }

    // override fun onCreateContextMenu(menu: Menu?): Boolean{
    //   menuInflater.inflate(R.menu.status_menu,menu)
    // return super.onCreateContextMenu(menu)
    //}

   
}
    class TabAdapter(fa: FragmentActivity, var list: List<Fragment>) : FragmentStateAdapter(fa) {
        override fun getItemCount() = list.size
        override fun createFragment(position: Int) = list[position]

    }
