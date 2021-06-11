package com.example.wilynleeandroid.event

import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import com.example.wilynleeandroid.Util
import com.example.wilynleeandroid.databinding.DispatchBinding

class EventDispatchActivity : Activity() {

    private lateinit var binding: DispatchBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DispatchBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        with(binding) {
            //view1.setOnClickListener { Util.log("onView1Click") }
            view2.setOnClickListener { Util.log("onView2Click") }
            //group.setOnClickListener { Util.log("onGroupClick") }
        }
    }


    /**
     * 一次触摸(正常人类操作)产生一个Action_Down、无数个Action_Move(滑动才有)和一个Action_Up
     * Action_Down后面执行onUserInteraction()
     *  在手指按住时按电源键会执行Action_Cancel
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN -> Util.log("ActivityTouch:    DOWN")
            MotionEvent.ACTION_UP -> Util.log("ActivityTouch:    UP")
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Util.log("ActivityTouchEvent:    ONTOUCHEVENT")
        return super.onTouchEvent(event)
    }

}