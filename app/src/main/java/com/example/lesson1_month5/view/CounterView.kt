package com.example.lesson1_month5.view

import android.widget.Toast


interface CounterView {

    fun updateCounter(model : Int)

    fun changeColor(color : Int)

    fun toast()

}