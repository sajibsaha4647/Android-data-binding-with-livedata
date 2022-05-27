package com.example.androiddatabindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mainviewmodel:ViewModel() {

    val livedatas = MutableLiveData("")

    fun updatedViewmodeldata(){
        livedatas.value = "this text hasbeen changes !"
    }



}