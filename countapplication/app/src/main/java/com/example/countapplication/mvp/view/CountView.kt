package com.example.countapplication.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.countapplication.R
import com.example.countapplication.databinding.ActivityMainBinding
import com.example.countapplication.mvp.contract.CountContract

class CountView(activity: Activity): ActivityView(activity), CountContract.View {
    private val binding : ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)
    init {
        activity.setContentView(binding.root)
    }
    override fun getValueInput(): String{
        return binding.value.text.toString()
    }
    override fun setValueCount(value: String){
        binding.result.text = value
    }
    override fun showError(){
        Toast.makeText(activity, activity?.getString(R.string.error_message), Toast.LENGTH_SHORT).show()
    }
    override fun onClickIncrementButton(function: () -> Unit){
        binding.buttonIncrement.setOnClickListener { function() }
    }
    override fun onClickDecrementButton(function: () -> Unit){
        binding.buttonDecrement.setOnClickListener { function() }
    }
    override fun onClickResetButton(function: () -> Unit){
        binding.buttonReset.setOnClickListener { function() }
    }

}