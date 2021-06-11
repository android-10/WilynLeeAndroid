package com.example.wilynleeandroid

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.example.wilynleeandroid.databinding.FirstWorkBinding

class FirstWorkActivity : Activity() {

    private lateinit var binding: FirstWorkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.view1.setOnClickListener { Util.log("click") }
    }
}