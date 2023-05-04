package com.io.utkarsh.mvvmcleanarchitecture_1.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.io.utkarsh.mvvmcleanarchitecture_1.R
import com.io.utkarsh.mvvmcleanarchitecture_1.databinding.ActivityHomeBinding
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.artists.ArtistActivity
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.movies.MoviesActivity
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.tvShows.TvShowsActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)

        binding.button.setOnClickListener {
            val intent = Intent(this,MoviesActivity::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent = Intent(this,TvShowsActivity::class.java)
            startActivity(intent)
        }
    }
}