package com.example.uikittink

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView


class CardCountMin
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private var titleText: TextView

    init {
        inflate(context, R.layout.card_cont_min, this)

        val ta = context.theme.obtainStyledAttributes(attrs, R.styleable.CardCountMin, 0, 0)
        val title = ta.getString(R.styleable.CardCountMin_title_min)

        titleText = this.findViewById<TextView>(R.id.title)
        //val icon = this.findViewById<TextView>(R.id.icon)

        titleText.text = title
    }

    fun setOnTitleClick(call: () -> Unit) {
        titleText.setOnClickListener {
            call.invoke()
        }
    }
}