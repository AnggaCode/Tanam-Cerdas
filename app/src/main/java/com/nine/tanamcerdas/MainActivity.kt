package com.nine.tanamcerdas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.nine.tanamcerdas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.containerView) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavbar.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination: NavDestination, _ ->
            when (destination.id) {
                R.id.navigation_home -> {
                    visible()
                }

                R.id.navigation_forum -> {
                    visible()
                }

                R.id.navigation_guide -> {
                    visible()
                }

                else -> {
                    invisible()
                }
            }
        }
    }


    private fun visible() {
        binding.bottomNavbar.visibility = View.VISIBLE
    }

    private fun invisible() {
        binding.bottomNavbar.visibility = View.GONE
    }
}