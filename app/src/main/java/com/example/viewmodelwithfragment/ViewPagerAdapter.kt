package com.example.viewmodelwithfragment
import android.R
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return NUMS_TAB
    }

    override fun createFragment(position: Int): Fragment {
        //TODO("Not yet implemented")
        when(position) {
            0 -> return FirstFragment()
            1 -> return  SecondFragment()
        }
        return FirstFragment()
    }




    companion object {
      private const val NUMS_TAB = 2
  }
}