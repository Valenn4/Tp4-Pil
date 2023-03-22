package com.example.countapplication.mvp.presenter

import com.example.countapplication.mvp.contract.CountContract

class CountPresenter(private var view: CountContract.View, private var model: CountContract.Model): CountContract.Presenter {
    init {
        view.onClickIncrementButton { onClickButtonIncrement() }
        view.onClickDecrementButton { onClickButtonDecrement() }
        view.onClickResetButton { onClickButtonReset() }
    }

    override fun onClickButtonIncrement(){
        model.increment(view.getValueIncrement())
        view.setValueCount(model.getValue())
    }
    override fun onClickButtonDecrement(){
        model.decrement(view.getValueIncrement())
        view.setValueCount(model.getValue())
    }
    override fun onClickButtonReset(){
        model.reset()
        view.setValueCount(model.getValue())
    }
}