package com.example.countapplication.mvp.presenter

import com.example.countapplication.mvp.contract.CountContract
import com.example.countapplication.mvp.model.CountModel
import io.mockk.*
import io.mockk.impl.annotations.RelaxedMockK
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
    fun `the user clicks on the increment button`() {
        every { view.getValueInput() } returns "4"
        presenter.onClickIncrementButton()
        verify { view.setValueCount("4") }
    }
    @Test
    fun `the user clicks on the decrement button`() {
        every { view.getValueInput() } returns "2"
        presenter.onClickDecrementButton()
        verify { view.setValueCount("-2") }
    }

    @Test
    fun `the user clicks on the reset button`() {
        every { view.getValueInput() } returns "4"
        presenter.onClickResetButton()
        verify { view.setValueCount("0") }
    }

    @Test
    fun `user not enter a value in increment`(){
        every { view.getValueInput() } returns ""
        presenter.onClickIncrementButton()
        verify { view.showError() }
    }

    @Test
    fun `user not enter a value in decrement`(){
        every { view.getValueInput() } returns ""
        presenter.onClickDecrementButton()
        verify { view.showError() }
    }
}