package com.alfred0ga.socioinfonavitandroid.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alfred0ga.socioinfonavitandroid.models.Wallets
import com.alfred0ga.socioinfonavitandroid.repository.InfonavitRepository
import kotlinx.coroutines.launch
import retrofit2.Response

private const val TAG = "MainViewModel"

class MainViewModel(
    val infonavitRepository: InfonavitRepository
): ViewModel() {
}