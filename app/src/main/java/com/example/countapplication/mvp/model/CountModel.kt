package com.example.countapplication.mvp.model

import com.example.countapplication.mvp.contract.CountContract

class CountModel: CountContract.Model {
    private var value_count : Int = 0

    override fun getValue(): String {
        return value_count.toString()
    }

    override fun increment(value_increment: Int){
        value_count += value_increment
    }

    override fun decrement(value_decrement: Int){
        value_count -= value_decrement
    }

    override fun reset(){
        value_count = 0
    }
}