package com.example.lesson1_month5.presenter

import com.example.lesson1_month5.model.CounterModel
import com.example.lesson1_month5.model.TextColorModel
import com.example.lesson1_month5.view.CounterView

class Presenter {

    private val model = CounterModel()
    private val colorModel = TextColorModel()
    private lateinit var view: CounterView

    fun increment(){
        model.increment()
        view.updateCounter(model.getCounter())
    }

    fun decrement(){
        model.decrement()
        view.updateCounter(model.getCounter())
    }

    fun attachView(view: CounterView){
        this.view = view
    }

    fun changeColor(){
        view.changeColor(colorModel.getColor())
    }
}