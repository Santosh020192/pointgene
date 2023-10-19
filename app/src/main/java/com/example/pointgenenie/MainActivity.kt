package com.example.pointgenenie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
   // lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      //val id = findViewById<TextView>(R.id.Rome)
        //var ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        loadFragment(HomeFragment())
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle the Home item click
                    // Show the corresponding fragment or perform an action
                    loadFragment(HomeFragment())
                    true
                }

                R.id.navigation_dashboard -> {
                    // Handle the Dashboard item click
                    // Show the corresponding fragment or perform an action

                    loadFragment(ExploreFragment())
                    true
                }

                R.id.navigation_AroundYou -> {
                    // Handle the Notifications item click
                    // Show the corresponding fragment or perform an action
                    loadFragment(AroundYou())

                    true
                }

                R.id.navigation_Messages -> {
                    // Handle the Notifications item click
                    // Show the corresponding fragment or perform an action
                    loadFragment(Messages())
                    true
                }

                R.id.navigation_Profile -> {
                    // Handle the Notifications item click
                    // Show the corresponding fragment or perform an action
                    loadFragment(ProfileFragment())
                    true
                }

                else -> true
            }
        }

/*        ratingBar.setOnRatingBarChangeListener { _, rating, fromUser ->
            if (fromUser) {
                // Do something with the new rating value
                // For example, display a toast message
                Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
            }
        }*/


    }


    private fun loadFragment(fragment: Fragment) {
        // Create a FragmentManager
        val fm: FragmentManager =
            supportFragmentManager // Use supportFragmentManager if you're using AppCompatActivity

        // Create a FragmentTransaction to begin the transaction and replace the Fragment
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()

        // Replace the FrameLayout with the new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment)

        // Save the changes
        fragmentTransaction.commit()
    }
}


