package com.example.countapplication.mvp.presenter

import com.example.countapplication.mvp.contract.CountContract
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

internal class CountPresenterTest {

    private lateinit var presenter: CountContract.Presenter
    private lateinit var model: CountContract.Model
    @MockK
    private lateinit var view: CountContract.View

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        presenter = CountPresenter(view, model)
    }

    @Test
    fun onClickButtonIncrement() {
        presenter.onClickButtonIncrement()
        verify { view.setValueCount("1") }
    }

    @Test
    fun onClickButtonDecrement() {
    }

    @Test
    fun onClickButtonReset() {
    }
}