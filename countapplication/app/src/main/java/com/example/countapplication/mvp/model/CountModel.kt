package com.example.countapplication.mvp.model

import com.example.countapplication.mvp.contract.CountContract

class CountModel: CountContract.Model {
    companion object {
        private const val ZERO = 0
    }

    private var value_count = ZERO

    override fun getValue(): String {
        return value_count.toString()
    }

    override fun increment(valueIncrement: Int){
        value_count += valueIncrement
    }

    override fun decrement(valueDecrement: Int){
        value_count -= valueDecrement
    }

    override fun reset(){
        value_count = ZERO
    }
}