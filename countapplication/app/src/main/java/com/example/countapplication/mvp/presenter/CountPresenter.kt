package com.example.countapplication.mvp.presenter

import com.example.countapplication.mvp.contract.CountContract

class CountPresenter(private var view: CountContract.View, private var model: CountContract.Model): CountContract.Presenter {
    init {
        view.onClickIncrementButton { onClickIncrementButton() }
        view.onClickDecrementButton { onClickDecrementButton() }
        view.onClickResetButton { onClickResetButton() }
    }

    override fun onClickIncrementButton(){
        if(view.getValueInput().isEmpty()){
            view.showError()
        } else {
            model.increment(view.getValueInput().toInt())
            view.setValueCount(model.getValue())
        }
    }
    override fun onClickDecrementButton(){
        if(view.getValueInput().isEmpty()){
            view.showError()
        } else {
            model.decrement(view.getValueInput().toInt())
            view.setValueCount(model.getValue())
        }
    }
    override fun onClickResetButton(){
        model.reset()
        view.setValueCount(model.getValue())
    }
}