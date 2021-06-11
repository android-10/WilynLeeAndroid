package com.example.wilynleeandroid.event

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.wilynleeandroid.Util

class OneView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet){


    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> Util.log("ViewTouch:    DOWN")
            MotionEvent.ACTION_UP -> Util.log("ViewTouch:    UP")
            MotionEvent.ACTION_MOVE -> Util.log("ViewTouch:    MOVE")
            MotionEvent.ACTION_OUTSIDE -> Util.log("ViewTouch:    OUTSIDE")
        }
        return super.dispatchTouchEvent(event)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }
}