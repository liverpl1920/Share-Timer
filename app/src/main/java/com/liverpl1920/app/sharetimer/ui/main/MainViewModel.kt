package com.liverpl1920.app.sharetimer.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalDateTime

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val name= MutableLiveData<String>()

    fun start() {
        GlobalScope.launch {
            val startTime = System.currentTimeMillis()
            while (true) {
                val diff: Long = System.currentTimeMillis() - startTime
                name.postValue("${diff / 1000.0}")
                delay(100)

            }
        }
    }
}