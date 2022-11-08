package com.example.lesson1_month5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lesson1_month5.databinding.ActivityMainBinding
import com.example.lesson1_month5.presenter.Presenter
import com.example.lesson1_month5.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    private val presenter = Presenter()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        onClick()
    }

    private fun onClick(){
        binding.btnIncrement.setOnClickListener {
            presenter.increment()
        }

        binding.btnDecrement.setOnClickListener {
           presenter.decrement()
        }
    }

    override fun updateCounter(model: Int) {
        binding.tvCounter.text=model.toString()
    }

    override fun changeColor(color: Int) {
        binding.tvCounter.setTextColor(color)
    }

    override fun toast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }
}