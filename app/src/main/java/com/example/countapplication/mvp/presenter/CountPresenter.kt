package com.example.countapplication.mvp.presenter

import com.example.countapplication.mvp.contract.CountContract

class CountPresenter(private var view: CountContract.View, private var model: CountContract.Model): CountContract.Presenter {
    init {
        view.onClickIncrementButton { onClickButtonIncrement() }
        view.onClickDecrementButton { onClickButtonDecrement() }
        view.onClickResetButton { onClickButtonReset() }
    }

    override fun onClickButtonIncrement(){
        if(view.getValueIncrement().isEmpty()){
            view.showError()
        } else {
            model.increment(view.getValueIncrement().toInt())
            view.setValueCount(model.getValue())
        }
    }
    override fun onClickButtonDecrement(){
        if(view.getValueIncrement().isEmpty()){
            view.showError()
        } else {
            model.decrement(view.getValueIncrement().toInt())
            view.setValueCount(model.getValue())
        }
    }
    override fun onClickButtonReset(){
        model.reset()
        view.setValueCount(model.getValue())
    }
}