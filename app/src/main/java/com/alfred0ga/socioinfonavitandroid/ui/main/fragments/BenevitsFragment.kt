package com.alfred0ga.socioinfonavitandroid.ui.main.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.alfred0ga.socioinfonavitandroid.R
import com.alfred0ga.socioinfonavitandroid.ui.main.MainActivity
import com.alfred0ga.socioinfonavitandroid.viewModels.MainViewModel

private const val TAG = "BenevitsFragment"

class BenevitFragment : Fragment(R.layout.fragment_benevits) {
    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        
    }
}