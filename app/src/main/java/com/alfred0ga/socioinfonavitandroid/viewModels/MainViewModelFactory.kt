package com.alfred0ga.socioinfonavitandroid.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alfred0ga.socioinfonavitandroid.repository.InfonavitRepository

class MainViewModelFactory(val infonavitRepository: InfonavitRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(infonavitRepository) as T
    }

}
