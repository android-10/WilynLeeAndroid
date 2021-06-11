package com.example.wilynleeandroid

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CornerTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    private var corner = 0f
    private var bgColor = 0
    private val gradientDrawable = GradientDrawable()


    init {
        context.theme
            .obtainStyledAttributes(attrs, R.styleable.CornerTextView, 0, 0)
            .apply {
                try {
                    corner = getDimension(R.styleable.CornerTextView_corner, 0f)
                    bgColor = getColor(
                        R.styleable.CornerTextView_bgColor,
                        resources.getColor(R.color.white)
                    )
                } finally {
                    recycle()
                }
            }

        gradientDrawable.cornerRadius = corner
        gradientDrawable.setColor(bgColor)

        background = gradientDrawable
    }
}