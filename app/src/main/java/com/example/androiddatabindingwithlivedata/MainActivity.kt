package com.example.androiddatabindingwithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androiddatabindingwithlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainviewmodel: Mainviewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainviewmodel = ViewModelProvider(this).get(Mainviewmodel::class.java)



        //        binding.newbtnid.setOnClickListener{
//            mainviewmodel.updatedViewmodeldata()
//            println("check text here"+binding.newbtnid.text)
//        }


        //handleing in view design onclick

        binding.maindata = mainviewmodel
        //this text sets from view designs
        binding.lifecycleOwner = this

//        mainviewmodel.livedatas.observe(this, Observer {
//            binding.newtextid.text = it
//        })




    }
}