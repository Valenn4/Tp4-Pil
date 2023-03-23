package com.example.countapplication.mvp.presenter

import com.example.countapplication.mvp.contract.CountContract
import com.example.countapplication.mvp.model.CountModel
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CountPresenterTest {

    private lateinit var presenter: CountContract.Presenter

    private lateinit var model: CountContract.Model
    @RelaxedMockK
    private lateinit var view: CountContract.View

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        model = CountModel()
        presenter = CountPresenter(view, model)
    }

    @Test
    fun onClickButtonIncrement() {
        every { view.getValueIncrement() } returns 4
        presenter.onClickButtonIncrement()
        verify { view.setValueCount("4") }
        /*
        every { view.getValueIncrement() } returns 12
        presenter.onClickButtonIncrement()
        verify { model.increment(12) }
         */
    }
    

    @Test
    fun onClickButtonDecrement() {
        every { view.getValueIncrement() } returns 2
        presenter.onClickButtonDecrement()
        verify { view.setValueCount("-2") }
    }

    @Test
    fun onClickButtonReset() {
        every { view.getValueIncrement() } returns 4
        presenter.onClickButtonReset()
        verify { view.setValueCount("0") }
    }
}