package com.aadarsh.rickymorty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.aadarsh.rickymorty.R
import com.aadarsh.rickymorty.databinding.ActivityMainBinding
import com.aadarsh.rickymorty.utils.gone
import com.aadarsh.rickymorty.utils.visible
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
                    as NavHostFragment

        navController = navHostFragment.findNavController()
        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    fun showProgress() {
        binding.progressBar.visible()
    }

    fun hideProgress() {
        binding.progressBar.gone()
    }
}

