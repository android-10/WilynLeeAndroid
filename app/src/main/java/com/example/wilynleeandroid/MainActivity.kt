package com.example.wilynleeandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wilynleeandroid.databinding.MainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: MainBinding
    val viewModel = MyViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Util.init(applicationContext)

        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        binding.handler = MyHandler()
    }
}