package com.example.wilynleeandroid

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.Toast
import java.lang.StringBuilder

@SuppressLint("StaticFieldLeak")
object Util {
    lateinit var context: Context
    fun init(context: Context) {
        this.context = context
    }

    fun show(vararg any: Any) {
        val builder = StringBuilder()
        for (a in any) {
            builder.append(a.toString())
        }
        Toast.makeText(context, builder.toString(), Toast.LENGTH_SHORT).show()
    }

    fun log(vararg any: Any) {
        val builder = StringBuilder()
        for (a in any) {
            builder.append(a.toString() + "\t")
        }
        Log.e("wilyn", builder.toString())
    }

    fun dp2px(dp: Int) = (context.resources.displayMetrics.density * dp + 0.5f).toInt()

}