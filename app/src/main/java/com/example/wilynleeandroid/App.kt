package com.example.wilynleeandroid

import android.app.Application
import android.content.Context

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        Util.init(this)
    }

}