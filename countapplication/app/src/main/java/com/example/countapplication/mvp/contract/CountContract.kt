package com.example.countapplication.mvp.contract

interface CountContract {
    interface View {
        fun getValueInput(): String
        fun setValueCount(value: String)
        fun cleanInputTextAndFocus()
        fun showError()
        fun onClickIncrementButton(function: () -> Unit)
        fun onClickDecrementButton(function: () -> Unit)
        fun onClickResetButton(function: () -> Unit)
    }

    interface Model {
        fun getValue(): String
        fun increment(value_increment: Int)
        fun decrement(value_decrement: Int)
        fun reset()
    }

    interface Presenter {
        fun onClickIncrementButton()
        fun onClickDecrementButton()
        fun onClickResetButton()
    }
}