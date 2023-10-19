package com.example.pointgenenie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pointgenenie.databinding.ProfileviewBinding


class ProfileFragment : Fragment() {

    private  lateinit var  binding: ProfileviewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank5, container, false)
        binding = ProfileviewBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val pagerAdapter = CustomPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = pagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)



      return root
    }


}