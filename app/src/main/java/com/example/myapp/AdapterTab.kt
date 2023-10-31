package com.example.myapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapp.db.Firebase
import com.example.myapp.db.RoomFragment
import com.example.myapp.db.UploadImageFirebase

class AdapterTab(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Firebase() // Firebase tab
            1 -> RoomFragment() // Room tab
            else -> UploadImageFirebase()
        }
    }
}