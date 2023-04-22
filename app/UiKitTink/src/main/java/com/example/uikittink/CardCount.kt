package com.example.uikittink

import android.content.Context
import android.media.Image
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView


class CardCount
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private var titleText: TextView
    private var subTitleText: TextView
    private var icon: ImageView

    init {
        inflate(context, R.layout.card_cont, this)

        val ta = context.theme.obtainStyledAttributes(attrs, R.styleable.CardCount, 0, 0)
        val title = ta.getString(R.styleable.CardCount_title)
        val subTitle = ta.getString(R.styleable.CardCount_sub_title)

         titleText = this.findViewById<TextView>(R.id.title)
         subTitleText = this.findViewById<TextView>(R.id.sub_title)
         icon = this.findViewById<ImageView>(R.id.icon)

        titleText.text = title
        subTitleText.text = subTitle
    }

    fun setOnTitleClick(call: () -> Unit) {
        titleText.setOnClickListener {
            call.invoke()
        }
    }

    fun setOnSubTitleClick(call: () -> Unit) {
        subTitleText.setOnClickListener {
            call.invoke()
        }
    }

    fun setOnClickIcon(call: () -> Unit) {
        icon.setOnClickListener {
            call.invoke()
        }
    }
}