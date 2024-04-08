package com.example.kotlin_viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
}

class MainAndroidViewModel(application: Application) : AndroidViewModel(application) {
}