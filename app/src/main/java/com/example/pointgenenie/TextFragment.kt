package com.example.pointgenenie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pointgenenie.databinding.ProfileviewBinding
import com.example.pointgenenie.databinding.FragmentLikesBinding

class TextFragment : Fragment() {
    private lateinit var binding: FragmentLikesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLikesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val imageList = listOf(R.drawable.monkey, R.drawable.dinaosar, R.drawable.bear , R.drawable.monke2) // Replace with your image resource IDs

        val adapter = ImageAdapter(requireContext(), imageList)
        binding.gridView.adapter = adapter
        binding.gridView.isNestedScrollingEnabled = true


        return root
    }

}