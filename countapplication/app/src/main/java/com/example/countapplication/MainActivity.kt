package com.example.countapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.countapplication.mvp.model.CountModel
import com.example.countapplication.mvp.presenter.CountPresenter
import com.example.countapplication.mvp.view.CountView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CountPresenter(CountView(this), CountModel())
    }
}