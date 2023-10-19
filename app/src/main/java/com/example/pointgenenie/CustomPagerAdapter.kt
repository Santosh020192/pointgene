package com.example.pointgenenie

import android.text.SpannableString
import android.text.style.AbsoluteSizeSpan
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bumptech.glide.Glide

class CustomPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    // Define the list of fragments and their titles here
    private val fragments = listOf(
        TextFragment(),
        TextFragment(),
        TextFragment()
    )


    private val fragmentTitles = listOf(
        "120 \nLikes",
        "55 \nFollowers",
        "65 \n Following"
    )

    // Return the fragment at the specified position
    override fun getItem(position: Int): Fragment {
        return fragments[position]


    }

    // Return the number of tabs
    override fun getCount(): Int {
        return fragments.size
    }

    // Return the title of the tab at the specified position
    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitles[position]
    }
}
