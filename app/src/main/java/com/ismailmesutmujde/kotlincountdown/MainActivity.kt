package com.ismailmesutmujde.kotlincountdown

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlincountdown.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bindingMainActivity: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMainActivity.root
        setContentView(view)

        // Abstract - Interface - Inheritance
        object : CountDownTimer (10000,1000) {
            override fun onTick(p0: Long) {
                bindingMainActivity.textView.text = "Left : ${p0/1000}"
            }

            override fun onFinish() {
                bindingMainActivity.textView.text = "Left : 0"
            }

        }.start()
    }
}