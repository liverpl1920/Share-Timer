package com.liverpl1920.app.sharetimer.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.liverpl1920.app.sharetimer.R
import com.liverpl1920.app.sharetimer.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding: MainFragmentBinding=DataBindingUtil.inflate(inflater, R.layout.main_fragment, container,false)
        binding.viewmodel=viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
}