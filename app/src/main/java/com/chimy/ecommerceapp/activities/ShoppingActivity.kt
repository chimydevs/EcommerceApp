package com.chimy.ecommerceapp.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.chimy.ecommerceapp.R
import com.chimy.ecommerceapp.databinding.ActivityShoopingBinding


class ShoppingActivity : AppCompatActivity () {
    val binding by lazy {
        ActivityShoopingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController(R.id.shoppingMostFragment)
        binding.buttomNavigation.setupWithNavController(navController)
    }
}