package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.tvShows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.io.utkarsh.mvvmcleanarchitecture_1.R
import com.io.utkarsh.mvvmcleanarchitecture_1.databinding.ActivityTvShowsBinding

class TvShowsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityTvShowsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tv_shows)
    }
}