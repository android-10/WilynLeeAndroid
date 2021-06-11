package com.example.wilynleeandroid.event

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.recyclerview.widget.RecyclerView
import com.example.wilynleeandroid.Util

class OneGroup(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {


    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN -> Util.log("GroupTouch:    DOWN")
            MotionEvent.ACTION_UP -> Util.log("GroupTouch:    UP")
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return super.onInterceptTouchEvent(ev)
    }
    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        //Util.log("GroupTouch:    ONTOUCHEVENT")
        return super.onTouchEvent(event)
    }
}