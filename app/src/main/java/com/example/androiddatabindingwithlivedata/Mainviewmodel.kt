package com.example.androiddatabindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mainviewmodel:ViewModel() {

    val livedatas = MutableLiveData("this is first sets data")

    fun updatedViewmodeldata(){
        livedatas.value = "this text hasbeen changes !"
    }



}