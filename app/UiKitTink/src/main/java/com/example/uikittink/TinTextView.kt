package com.example.uikittink

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout

class TinTextView
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.tin_text_view, this)
    }

}