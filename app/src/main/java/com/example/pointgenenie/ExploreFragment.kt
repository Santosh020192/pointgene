package com.example.pointgenenie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.pointgenenie.databinding.ActivityRomeBinding
import com.example.pointgenenie.databinding.ProfileviewBinding
import com.example.pointgenenie.databinding.FragmentLikesBinding

class ExploreFragment : Fragment() {
    private lateinit var binding: ActivityRomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityRomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//
//        binding.card.setOnClickListener {
//
//            Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()
//
//            val intent = Intent(context,MainActivity::class.java)
//            startActivity(intent)
//        }

        return root
    }

}