package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.io.utkarsh.mvvmcleanarchitecture_1.R
import com.io.utkarsh.mvvmcleanarchitecture_1.databinding.ActivityMoviesBinding

class MoviesActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMoviesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_movies)
    }
}