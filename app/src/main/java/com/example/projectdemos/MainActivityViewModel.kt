package com.example.projectdemos

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){
    private var clickCount:Int =0
    private var countLiveData= MutableLiveData<Int>()

    fun getInitialcount():MutableLiveData<Int>{
        countLiveData.value=clickCount
        return countLiveData
    }

    fun getCurrentCount(){
        clickCount+=1
        countLiveData.value=clickCount
    }}