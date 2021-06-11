package com.example.wilynleeandroid

import android.content.Intent
import android.view.View

class MyHandler {

    fun click(view: View) {
        view.context.startActivity(Intent(view.context, FirstWorkActivity::class.java))
    }

}