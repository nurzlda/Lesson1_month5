package com.example.lesson1_month5.model


class CounterModel  {

    private var counter = 0

   fun increment(){
        counter ++
    }

    fun decrement(){
        counter--
    }

    fun getCounter() : Int{
        return counter

    }
}