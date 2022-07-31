package com.android.baseapp.ui.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.baseapp.R
import com.android.baseapp.databinding.FragmentMovieListBinding
import com.android.baseapp.ui.base.BaseViewModelFragment


class MovieListFragment :
    BaseViewModelFragment<MovieListViewModel, FragmentMovieListBinding>(
        MovieListViewModel::class
    ) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initViews() {
        super.initViews()
    }

    override fun initObservers() {
        super.initObservers()
    }
}