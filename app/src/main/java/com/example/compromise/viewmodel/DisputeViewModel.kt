package com.example.compromise.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class DisputeViewModel: ViewModel() {

    init {
        Log.e("AAA", "VM created")
    }

    override fun onCleared() {
        Log.e("AAA", "VM cleared")
        super.onCleared()
    }
}