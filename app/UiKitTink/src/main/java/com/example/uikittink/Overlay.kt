package com.example.uikittink

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout


class Overlay
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr){

    init {
        inflate(context, R.layout.overlay, this)

       // val ta = context.theme.obtainStyledAttributes(attrs, R.styleable.Overlay, 0, 0)
       // val barHeight = ta.getString(R.styleable.Overlay_title_test)
       // Log.d("test", "asdasd $barHeight")
    }
}