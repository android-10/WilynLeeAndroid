package com.example.wilynleeandroid

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import com.example.wilynleeandroid.databinding.FloatViewBinding

class FloatView(context: Context, attributeSet: AttributeSet) :
    FrameLayout(context, attributeSet) {

    var binding: FloatViewBinding


    init {
        val inflater = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)) as LayoutInflater
        binding = DataBindingUtil.inflate(inflater, R.layout.float_view, this, true)
    }

    fun onScroll(y: Float) {
        Util.log(y)
        val params = binding.con.layoutParams
        params.width = Util.dp2px(121) - y.toInt() % Util.dp2px(121)
        if (params.width < Util.dp2px(42)) {
            binding.cor.visibility = View.VISIBLE
            return
        }else{
            binding.cor.visibility = View.INVISIBLE
        }
        binding.bg1.x = y.toInt() % Util.dp2px(121).toFloat()

        binding.con.layoutParams = params
    }
}